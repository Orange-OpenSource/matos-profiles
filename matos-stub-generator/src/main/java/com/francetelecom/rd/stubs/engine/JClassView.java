package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.AbstractLayoutCache;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 * A swing tree that shows what has been achieved for annotations.
 * @author piac6784
 *
 */
@SuppressWarnings("serial")
public class JClassView extends JTree {
  
  final static String COMMAND_KEY = "launchEditor";
  
  private final static int WIDTH= 800;
  private final static int HEIGHT= 600;
  private final static int WIDTH_MIN = 300;
  private final static int HEIGHT_MIN= 350;
  
  private static final int VERSION_CELL_WIDTH = 100;
  private static final int VERSION_CELL_HEIGHT = 14;  
 
  String annotationPackage;
  
  /**
   * Table that map packages to the sub package they "contain" (intuitive meaning if not formal).
   */
  HashMap<String, HashSet<String>> subPackages = new HashMap<String,HashSet<String>> ();
  /**
   * Table that map package to the classes they contain.
   */
  HashMap<String, HashSet<Class<?>>> packageContents = new HashMap<String,HashSet<Class<?>>> ();
  
  static VersionDatabase database;

  private static Component legend;
  
  private String command;
  
  
  
  /**
   * Reimplementation of BasicTreeUI to make JTree take all the space
   * available for its width.
   * @author tkdn3113
   *
   */
  public static class ExpandedTreeUI extends BasicTreeUI {
    
    @Override
    protected void installListeners() {
      super.installListeners();
      
      tree.addComponentListener(componentListener);
    }
    
    @Override
    protected void uninstallListeners() {
      tree.removeComponentListener(componentListener);
      
      super.uninstallListeners();
    }
    
    @Override
    protected AbstractLayoutCache.NodeDimensions createNodeDimensions() {
      return new NodeDimensionsHandler() {
        @Override
        public Rectangle getNodeDimensions(Object value, int row, int depth, boolean expanded, Rectangle size) {
          Rectangle dimensions = super.getNodeDimensions(value, row, depth, expanded, size);
          Insets insets = tree.getInsets();
          dimensions.width = tree.getWidth() - getRowX(row, depth) - insets.left - insets.right;
          return dimensions;
        }
      };
    }
    
    private final ComponentListener componentListener = new ComponentAdapter() {
      @Override
      public void componentResized(ComponentEvent e) {
        treeState.invalidateSizes();
        tree.repaint();
      };
    };
    
  }
  
  /**
   * Tells how to display each row in the tree.
   * @author piac6784
   *
   */
  private static class Renderer extends DefaultTreeCellRenderer {
    
    private static final long serialVersionUID = 1L;
    
    private final ArrayList<String> versions;
    
    private JPanel renderer = new JPanel();
    private JLabel main = new JLabel();
    private JPanel annotPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private Box versionPanel = Box.createHorizontalBox();
    
    public Renderer() {
      renderer.setLayout(new BoxLayout(renderer, BoxLayout.LINE_AXIS));
      renderer.add(main);
      renderer.add(annotPanel);
      renderer.add(Box.createHorizontalStrut(10));
      renderer.add(Box.createHorizontalGlue());
      renderer.add(versionPanel);
      renderer.add(Box.createHorizontalStrut(10));
      renderer.setBorder(BorderFactory.createEmptyBorder());
      annotPanel.setBorder(BorderFactory.createEmptyBorder());
      main.setBorder(BorderFactory.createEmptyBorder());
      main.setFont(super.getFont());
      
      versions = new ArrayList<String>();
      List<String> rawVersions = database.getVersion();
      for(String v : rawVersions) {
        String version = v.substring(1);
        if(!versions.contains(version))
          versions.add(version);
      }
    }
    
    @Override
    public Component getTreeCellRendererComponent(
        JTree tree, Object value, boolean selected,
        boolean expanded, boolean leaf, int row,
        boolean hasFocus) {
      if (value instanceof Node) {
        Node node = (Node) value;
        setColor(node.getColor());
      } else {
        setColor(Color.black);
      }
      if (value instanceof Node) {
        Node node = (Node) value;
        main.setIcon(node.getIcon());
        main.setText(node.toString());
        annotPanel.removeAll();
        for(Icon i : node.getIcons()) annotPanel.add(new JLabel(i));
        versionPanel.removeAll();
        
        for(String v : versions) {
          JComponent versionLabel;
          if( row == 0 ) {
            versionLabel = new JLabel(v);
            versionLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 1, Color.black ));
            versionLabel.setBackground( Color.white );
          }
          else { 
            versionLabel = new JPanel();
            if(selected)
              versionLabel.setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, Color.black ));
            else
              versionLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black ));
           
            versionLabel.setBackground( node.getColorForVersion(v) );
          }
          
          versionLabel.setOpaque(true);
          versionLabel.setPreferredSize( new Dimension(VERSION_CELL_WIDTH, VERSION_CELL_HEIGHT) );
          versionLabel.setMinimumSize( new Dimension(VERSION_CELL_WIDTH, VERSION_CELL_HEIGHT) );
          versionLabel.setMaximumSize( new Dimension(VERSION_CELL_WIDTH, VERSION_CELL_HEIGHT) );
          
          versionPanel.add(versionLabel);
          versionPanel.add(Box.createHorizontalStrut(1));
        }
        renderer.setBackground(selected ? backgroundSelectionColor : node.getDepthColor());
        annotPanel.setBackground(selected ? backgroundSelectionColor : node.getDepthColor());
        versionPanel.setBackground(selected ? backgroundSelectionColor : node.getDepthColor());
        
      } else {
        renderer.setBackground(selected ? backgroundSelectionColor : backgroundNonSelectionColor);
        annotPanel.setBackground(selected ? backgroundSelectionColor : backgroundNonSelectionColor);
        versionPanel.setBackground(selected ? backgroundSelectionColor : backgroundNonSelectionColor);
        main.setIcon(null);
        main.setText(value.toString());
      }
      
      renderer.setEnabled(tree.isEnabled());
      
      return renderer;
    }
    
    private void setColor(Color c) {
      main.setForeground(c);    
    }
    
  }
  
  /**
   * How to react to mouse event (use button 2 so we do not rely on the tree event listener
   * interface) 
   * @author piac6784
   *
   */
  transient private MouseListener ml =
    new MouseAdapter() {
    @Override
    public void mousePressed(MouseEvent e) {
      int selRow = getRowForLocation(e.getX(), e.getY());
      TreePath selPath = getPathForLocation(e.getX(), e.getY());
      if(selRow != -1) {
        if(e.getButton() == MouseEvent.BUTTON2) {
          launch(selPath);
        }
      }
    }
  };
  
  ReflexUtil rf;
  /**
   * Builds the tree widget. Takes various properties as argument. 
   * @param prefix
   * @param properties
   */
  public JClassView(ReflexUtil rf, Properties properties) {
    this.rf = rf;
    
    command = properties.getProperty(COMMAND_KEY);
    setCellRenderer(new Renderer());
    // hack to be able to draw a table next to the tree, right aligned. 
    setUI(new ExpandedTreeUI());
    addMouseListener(ml);
  }
  
  
  /**
   * Register a class in the hierarchy displayed by the tree.
   * @param clazz
   */
  public void register(Class<?> clazz) {
    if (clazz.isMemberClass() || clazz.isAnonymousClass()) return;
    String pkgName = ReflexUtil.getPackageName(clazz);
    if (pkgName == null) { throw new RuntimeException("null package name");	}
    pkgName = rf.restoreString(pkgName);
    add(packageContents, pkgName, clazz);
    registerPackage(pkgName);
  }
  
  /**
   * Auxiliary method to register subpackage relations.
   * @param pkgName
   */
  private void registerPackage(String pkgName) {
    int p = pkgName.lastIndexOf('.');
    if (p > 0) {
      String parent = pkgName.substring(0,p);
      add(subPackages, parent, pkgName);
      registerPackage(parent);
    } else {
      if (pkgName.length() > 0) add(subPackages,"",pkgName);
    }
  }
  
  /**
   * Utility method to add an element to a multimap
   * @param <K> type of key
   * @param <V> type of value
   * @param map map that map an element to one or more values (in a set)
   * @param key key
   * @param value value
   */
  private static <K,V> void add(HashMap<K, HashSet<V>> map, K key, V value) {
    HashSet <V> cell = map.get(key);
    if (cell == null) {
      cell = new HashSet<V>();
      map.put(key, cell);
    }
    cell.add(value);
  }
  
  /**
   * Init the model in the tree when all the classes are registered.
   */
  public void init() {
    Node root = new Node(this, "", -1);
    TreeModel model = new DefaultTreeModel(root);
    this.setModel(model);
  }
  
  
  /**
   * Launch an editor on a class.
   * @param selPath
   * @return
   */
  private int launch(TreePath selPath) {
    Node c = (Node) selPath.getLastPathComponent();
    Object content = c.getContent();
    if (content instanceof Class<?>) {
      String path = rf.restoreString(((Class <?>) content).getName().replace('.', '/'));
      if (path.contains("$")) return -1;
      String args = command.replace("$$", path);
      Runtime runtime = Runtime.getRuntime();
      try {
        Process p = runtime.exec(args);
        return p.waitFor(); 
      } catch (Exception e) { return 1; }
    } else return -1;
  }
  
  /**
   * Generate the view containing the class tree.
   * @param hierarchy The hierarchy of observed classes.
   * @param rf a relocation context.
   * @param properties properties (contain the command name).
   * @param database 
   */
  public static void viewStat(Hierarchy hierarchy, ReflexUtil rf, Properties properties, VersionDatabase db) {
	final JFrame frame = new JFrame("stubs");
    database = db;
    
    ActionListener actionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	frame.dispose();
      }
    };
    ItemListener itemListener = new ItemListener() {
      boolean showLegend = false;
      @Override
      public void itemStateChanged(ItemEvent e) {
        showLegend = !showLegend;
        legend.setVisible(showLegend);
        System.out.println("show legend: "+ (showLegend?"yes":"no") );
      }
    };
    
    JClassView tree = new JClassView(rf,properties);
    for(Class <?> clazz : hierarchy.getContents()) {tree.register(clazz);}
    tree.init();
    
    frame.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
    frame.setIconImage(new ImageIcon(JClassView.class.getResource("icons/annotation.png")).getImage());
    frame.setMinimumSize(new Dimension(WIDTH_MIN,HEIGHT_MIN));
    frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
    
    JScrollPane scrollPane = new JScrollPane(tree);
    
    legend = createLegend();
    Box contentPane = new Box(BoxLayout.PAGE_AXIS);
    contentPane.add(scrollPane);
    contentPane.add(legend);
    legend.setVisible(false);
    frame.setContentPane(contentPane);
    frame.setJMenuBar(createMenuBar(actionListener, itemListener));
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
    
    frame.pack();
    frame.setVisible(true);
  }


  private static Component createLegend() {
    Box hBox = new Box(BoxLayout.LINE_AXIS);
    Box hHBox;
    Box vBox;
    
    vBox = new Box(BoxLayout.PAGE_AXIS);
    // color desc line
    hHBox = new Box(BoxLayout.LINE_AXIS);
    JLabel label = new JLabel("   ");
    label.setBackground(Node.PACKAGE_VERSION_COLORS.allPresentandVisible);
    label.setOpaque(true);
    hHBox.add(label);
    hHBox.add(Box.createHorizontalGlue());
    hHBox.add(new JLabel("All elements are present and visible"));
    vBox.add(hHBox);
    vBox.add(Box.createVerticalStrut(15));
    // color desc line
    hHBox = new Box(BoxLayout.LINE_AXIS);
    label = new JLabel("   ");
    label.setBackground(Node.PACKAGE_VERSION_COLORS.allPresentAndHidden);
    label.setOpaque(true);
    hHBox.add(label);
    hHBox.add(Box.createHorizontalGlue());
    hHBox.add(new JLabel("All elements are present and hidden"));
    vBox.add(hHBox);
    vBox.add(Box.createVerticalStrut(15));
    // color desc line
    hHBox = new Box(BoxLayout.LINE_AXIS);
    label = new JLabel("   ");
    label.setBackground(Node.PACKAGE_VERSION_COLORS.allPresentSomeHidden);
    label.setOpaque(true);
    hHBox.add(label);
    hHBox.add(Box.createHorizontalGlue());
    hHBox.add(new JLabel("All elements are present but some are hidden"));
    vBox.add(hHBox);
    vBox.add(Box.createVerticalStrut(15));
    hBox.add(vBox);
    hBox.add(Box.createHorizontalGlue());
    
    
    vBox = new Box(BoxLayout.PAGE_AXIS);
    // color desc line
    hHBox = new Box(BoxLayout.LINE_AXIS);
    label = new JLabel("   ");
    label.setBackground(Node.PACKAGE_VERSION_COLORS.someElementsNotPresentButAllVisible);
    label.setOpaque(true);
    hHBox.add(label);
    hHBox.add(Box.createHorizontalGlue());
    hHBox.add(new JLabel("Some elements are not present but all are visible"));
    vBox.add(hHBox);
    vBox.add(Box.createVerticalStrut(15));
    // color desc line
    hHBox = new Box(BoxLayout.LINE_AXIS);
    label = new JLabel("   ");
    label.setBackground(Node.PACKAGE_VERSION_COLORS.someElementsNotPresentButAllHidden);
    label.setOpaque(true);
    hHBox.add(label);
    hHBox.add(Box.createHorizontalGlue());
    hHBox.add(new JLabel("Some elements are not present but all are hidden"));
    vBox.add(hHBox);
    vBox.add(Box.createVerticalStrut(15));
    // color desc line
    hHBox = new Box(BoxLayout.LINE_AXIS);
    label = new JLabel("   ");
    label.setBackground(Node.PACKAGE_VERSION_COLORS.someElementsNotPresent);
    label.setOpaque(true);
    hHBox.add(label);
    hHBox.add(Box.createHorizontalGlue());
    hHBox.add(new JLabel("Some elements are not present (both visible and hidden)"));
    vBox.add(hHBox);
    vBox.add(Box.createVerticalStrut(15));
    // color desc line
    hHBox = new Box(BoxLayout.LINE_AXIS);
    label = new JLabel("   ");
    label.setBackground(Node.PACKAGE_VERSION_COLORS.noElementsPresent);
    label.setOpaque(true);
    hHBox.add(label);
    hHBox.add(Box.createHorizontalGlue());
    hHBox.add(new JLabel("No elements are present"));
    vBox.add(hHBox);
    hBox.add(vBox);
    
    return hBox;
  }


  private static JMenuBar createMenuBar(ActionListener aL, ItemListener iL) {
    //Where the GUI is created:
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JCheckBoxMenuItem cbMenuItem;
    
    //Create the menu bar.
    menuBar = new JMenuBar();
    
    //Build the first menu.
    menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_F);
    menuBar.add(menu);
    
    menuItem = new JMenuItem("Quit", KeyEvent.VK_Q);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
    menuItem.addActionListener(aL);
    menu.add(menuItem);
    
    
    //Build second menu in the menu bar.
    menu = new JMenu("View");
    menu.setMnemonic(KeyEvent.VK_V);
    menuBar.add(menu);

    cbMenuItem = new JCheckBoxMenuItem("Show legend");
    cbMenuItem.setMnemonic(KeyEvent.VK_L);
    cbMenuItem.addItemListener(iL);
    menu.add(cbMenuItem);

    return menuBar;
  }
  
}
