package javax.microedition.amms;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class GlobalManager extends java.lang.Object{
// Fields
// Methods
    public static javax.microedition.media.Control[] getControls(){
    	return null;
    }
 /*
    @Code({
        "switch (0) {",
        "    case 0: return new com.francetelecom.rd.fakemidp.jsr234.ChorusControlImplem();",
        "    case 1: return new com.francetelecom.rd.fakemidp.jsr234.EqualizerControlImplem();", 
        "    case 2: return new com.francetelecom.rd.fakemidp.jsr234.ReverbSourceControlImplem();", 
        "    case 3: return new com.francetelecom.rd.fakemidp.jsr234.AudioVirtualizerControlImplem();", 
        "    case 4: return new com.francetelecom.rd.fakemidp.jsr234.ReverbControlImplem();",
        "    case 5: return new com.francetelecom.rd.fakemidp.jsr234.CommitControlImplem();",
        "    case 6: return new com.francetelecom.rd.fakemidp.jsr234.OrientationControlImplem();", 
        "    case 7: return new com.francetelecom.rd.fakemidp.jsr234.ObstructionControlImplem(); ",
        "    case 8: return new com.francetelecom.rd.fakemidp.jsr234.MacroscopicControlImplem();",
        "    case 9: return new com.francetelecom.rd.fakemidp.jsr234.DirectivityControlImplem();",
        "    case 10: return new com.francetelecom.rd.fakemidp.jsr234.DistanceAttenuationControlImplem() ;",
        "    case 11: return new com.francetelecom.rd.fakemidp.jsr234.DopplerControlImplem() ;",
        "    case 12: return new com.francetelecom.rd.fakemidp.jsr234.LocationControlImplem() ;",
        "    case 13: return new com.francetelecom.rd.fakemidp.jsr234.PanControlImplem() ;",
        "    case 14: return new com.francetelecom.rd.fakemidp.jsr234.EffectOrderControlImplem() ;",
        "    case 15: return new com.francetelecom.rd.fakemidp.jsr234.CameraControlImplem() ;",
        "    case 16: return new com.francetelecom.rd.fakemidp.jsr234.ExposureControlImplem() ;",
        "    case 17: return new com.francetelecom.rd.fakemidp.jsr234.FlashControlImplem() ;",
        "    case 18: return new com.francetelecom.rd.fakemidp.jsr234.FocusControlImplem() ;",
        "    case 19: return new com.francetelecom.rd.fakemidp.jsr234.ZoomControlImplem() ;",
        "    case 20: return new com.francetelecom.rd.fakemidp.jsr234.SnapshotControlImplem() ;",
        "    case 21: return new com.francetelecom.rd.fakemidp.jsr234.ImageFormatControlImplem() ;",
        "    case 22: return new com.francetelecom.rd.fakemidp.jsr234.RDSControlImplem() ;",
        "    case 23: return new com.francetelecom.rd.fakemidp.jsr234.TunerControlImplem() ;",
        "    case 24: return new com.francetelecom.rd.fakemidp.jsr234.ImageTransformControlImplem() ;",
        "    case 25: return new com.francetelecom.rd.fakemidp.jsr234.ImageEffectControlImplem() ;",
        "    case 26: return new com.francetelecom.rd.fakemidp.jsr234.OverlayControlImplem() ;",
        "    case 27: return new com.francetelecom.rd.fakemidp.jsr234.ImageTonalityControlImplem() ;",
        "    case 28: return new com.francetelecom.rd.fakemidp.jsr234.WhiteBalanceControlImplem() ;",
        "    case 29: return new com.francetelecom.rd.fakemidp.jsr234.ContainerFormatControlImplem() ;",
        "    case 30: return new com.francetelecom.rd.fakemidp.jsr234.AudioFormatControlImplem() ;",
        "    case 31: return new com.francetelecom.rd.fakemidp.jsr234.MIDIChannelControlImplem() ;",
        "    case 32: return new com.francetelecom.rd.fakemidp.jsr234.VideoFormatControlImplem() ;",
        "    case 33: return new com.francetelecom.rd.fakemidp.jsr234.PriorityControlImplem() ;",
        "    default: return null;",
        "}"
    })
    */
    public static javax.microedition.media.Control getControl(String controlType){
    	return null;
    }
    public static javax.microedition.amms.Spectator getSpectator()
		throws javax.microedition.media.MediaException{ return null;
    }
    public static javax.microedition.amms.EffectModule createEffectModule()
		throws javax.microedition.media.MediaException { return null;
    }
    
    public static javax.microedition.amms.SoundSource3D createSoundSource3D()
    throws javax.microedition.media.MediaException{ return null;
    }
    
    public static String[] getSupportedSoundSource3DPlayerTypes(){ return null;
    }
    
    public static javax.microedition.amms.MediaProcessor createMediaProcessor(String inputType)
		throws javax.microedition.media.MediaException{
    	return null;
    }
    
    public static String[] getSupportedMediaProcessorInputTypes(){ return null; }
// Default constructor
    public GlobalManager(){ super(); }
}
