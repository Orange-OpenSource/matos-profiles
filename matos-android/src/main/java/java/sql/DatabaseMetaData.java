package java.sql;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.DatabaseMetaDataImpl")
public interface DatabaseMetaData
  extends Wrapper
{
  // Fields

  public static final short attributeNoNulls = 0;

  public static final short attributeNullable = 1;

  public static final short attributeNullableUnknown = 2;

  public static final int bestRowNotPseudo = 1;

  public static final int bestRowPseudo = 2;

  public static final int bestRowSession = 2;

  public static final int bestRowTemporary = 0;

  public static final int bestRowTransaction = 1;

  public static final int bestRowUnknown = 0;

  public static final int columnNoNulls = 0;

  public static final int columnNullable = 1;

  public static final int columnNullableUnknown = 2;

  public static final int importedKeyCascade = 0;

  public static final int importedKeyInitiallyDeferred = 5;

  public static final int importedKeyInitiallyImmediate = 6;

  public static final int importedKeyNoAction = 3;

  public static final int importedKeyNotDeferrable = 7;

  public static final int importedKeyRestrict = 1;

  public static final int importedKeySetDefault = 4;

  public static final int importedKeySetNull = 2;

  public static final int procedureColumnIn = 1;

  public static final int procedureColumnInOut = 2;

  public static final int procedureColumnOut = 4;

  public static final int procedureColumnResult = 3;

  public static final int procedureColumnReturn = 5;

  public static final int procedureColumnUnknown = 0;

  public static final int procedureNoNulls = 0;

  public static final int procedureNoResult = 1;

  public static final int procedureNullable = 1;

  public static final int procedureNullableUnknown = 2;

  public static final int procedureResultUnknown = 0;

  public static final int procedureReturnsResult = 2;

  public static final int sqlStateSQL99 = 2;

  public static final int sqlStateXOpen = 1;

  public static final short tableIndexClustered = 1;

  public static final short tableIndexHashed = 2;

  public static final short tableIndexOther = 3;

  public static final short tableIndexStatistic = 0;

  public static final int typeNoNulls = 0;

  public static final int typeNullable = 1;

  public static final int typeNullableUnknown = 2;

  public static final int typePredBasic = 2;

  public static final int typePredChar = 1;

  public static final int typePredNone = 0;

  public static final int typeSearchable = 3;

  public static final int versionColumnNotPseudo = 1;

  public static final int versionColumnPseudo = 2;

  public static final int versionColumnUnknown = 0;

  public static final int sqlStateSQL = 2;

  public static final int functionColumnIn = 1;

  public static final int functionColumnInOut = 2;

  public static final int functionColumnOut = 3;

  public static final int functionReturn = 4;

  public static final int functionColumnUnknown = 0;

  public static final int functionColumnResult = 5;

  public static final int functionNoNulls = 0;

  public static final int functionNullable = 1;

  public static final int functionNullableUnknown = 2;

  public static final int functionResultUnknown = 0;

  public static final int functionNoTable = 1;

  public static final int functionReturnsTable = 2;

  // Methods

  public java.lang.String getURL() throws SQLException;
  public boolean isReadOnly() throws SQLException;
  public ResultSet getAttributes(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws SQLException;
  public Connection getConnection() throws SQLException;
  public java.lang.String getUserName() throws SQLException;
  public int getResultSetHoldability() throws SQLException;
  public ResultSet getTables(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String [] arg4) throws SQLException;
  public ResultSet getFunctions(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public boolean allProceduresAreCallable() throws SQLException;
  public boolean allTablesAreSelectable() throws SQLException;
  public boolean dataDefinitionCausesTransactionCommit() throws SQLException;
  public boolean dataDefinitionIgnoredInTransactions() throws SQLException;
  public boolean deletesAreDetected(int arg1) throws SQLException;
  public boolean doesMaxRowSizeIncludeBlobs() throws SQLException;
  public ResultSet getBestRowIdentifier(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, boolean arg5) throws SQLException;
  public ResultSet getCatalogs() throws SQLException;
  public java.lang.String getCatalogSeparator() throws SQLException;
  public java.lang.String getCatalogTerm() throws SQLException;
  public ResultSet getColumnPrivileges(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws SQLException;
  public ResultSet getColumns(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws SQLException;
  public ResultSet getCrossReference(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws SQLException;
  public int getDatabaseMajorVersion() throws SQLException;
  public int getDatabaseMinorVersion() throws SQLException;
  public java.lang.String getDatabaseProductName() throws SQLException;
  public java.lang.String getDatabaseProductVersion() throws SQLException;
  public int getDefaultTransactionIsolation() throws SQLException;
  public int getDriverMajorVersion();
  public int getDriverMinorVersion();
  public java.lang.String getDriverName() throws SQLException;
  public java.lang.String getDriverVersion() throws SQLException;
  public ResultSet getExportedKeys(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public java.lang.String getExtraNameCharacters() throws SQLException;
  public java.lang.String getIdentifierQuoteString() throws SQLException;
  public ResultSet getImportedKeys(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public ResultSet getIndexInfo(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, boolean arg5) throws SQLException;
  public int getJDBCMajorVersion() throws SQLException;
  public int getJDBCMinorVersion() throws SQLException;
  public int getMaxBinaryLiteralLength() throws SQLException;
  public int getMaxCatalogNameLength() throws SQLException;
  public int getMaxCharLiteralLength() throws SQLException;
  public int getMaxColumnNameLength() throws SQLException;
  public int getMaxColumnsInGroupBy() throws SQLException;
  public int getMaxColumnsInIndex() throws SQLException;
  public int getMaxColumnsInOrderBy() throws SQLException;
  public int getMaxColumnsInSelect() throws SQLException;
  public int getMaxColumnsInTable() throws SQLException;
  public int getMaxConnections() throws SQLException;
  public int getMaxCursorNameLength() throws SQLException;
  public int getMaxIndexLength() throws SQLException;
  public int getMaxProcedureNameLength() throws SQLException;
  public int getMaxRowSize() throws SQLException;
  public int getMaxSchemaNameLength() throws SQLException;
  public int getMaxStatementLength() throws SQLException;
  public int getMaxStatements() throws SQLException;
  public int getMaxTableNameLength() throws SQLException;
  public int getMaxTablesInSelect() throws SQLException;
  public int getMaxUserNameLength() throws SQLException;
  public java.lang.String getNumericFunctions() throws SQLException;
  public ResultSet getPrimaryKeys(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public ResultSet getProcedureColumns(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws SQLException;
  public ResultSet getProcedures(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public java.lang.String getProcedureTerm() throws SQLException;
  public ResultSet getSchemas() throws SQLException;
  public ResultSet getSchemas(java.lang.String arg1, java.lang.String arg2) throws SQLException;
  public java.lang.String getSchemaTerm() throws SQLException;
  public java.lang.String getSearchStringEscape() throws SQLException;
  public java.lang.String getSQLKeywords() throws SQLException;
  public int getSQLStateType() throws SQLException;
  public java.lang.String getStringFunctions() throws SQLException;
  public ResultSet getSuperTables(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public ResultSet getSuperTypes(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public java.lang.String getSystemFunctions() throws SQLException;
  public ResultSet getTablePrivileges(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public ResultSet getTableTypes() throws SQLException;
  public java.lang.String getTimeDateFunctions() throws SQLException;
  public ResultSet getTypeInfo() throws SQLException;
  public ResultSet getUDTs(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int [] arg4) throws SQLException;
  public ResultSet getVersionColumns(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException;
  public boolean insertsAreDetected(int arg1) throws SQLException;
  public boolean isCatalogAtStart() throws SQLException;
  public boolean locatorsUpdateCopy() throws SQLException;
  public boolean nullPlusNonNullIsNull() throws SQLException;
  public boolean nullsAreSortedAtEnd() throws SQLException;
  public boolean nullsAreSortedAtStart() throws SQLException;
  public boolean nullsAreSortedHigh() throws SQLException;
  public boolean nullsAreSortedLow() throws SQLException;
  public boolean othersDeletesAreVisible(int arg1) throws SQLException;
  public boolean othersInsertsAreVisible(int arg1) throws SQLException;
  public boolean othersUpdatesAreVisible(int arg1) throws SQLException;
  public boolean ownDeletesAreVisible(int arg1) throws SQLException;
  public boolean ownInsertsAreVisible(int arg1) throws SQLException;
  public boolean ownUpdatesAreVisible(int arg1) throws SQLException;
  public boolean storesLowerCaseIdentifiers() throws SQLException;
  public boolean storesLowerCaseQuotedIdentifiers() throws SQLException;
  public boolean storesMixedCaseIdentifiers() throws SQLException;
  public boolean storesMixedCaseQuotedIdentifiers() throws SQLException;
  public boolean storesUpperCaseIdentifiers() throws SQLException;
  public boolean storesUpperCaseQuotedIdentifiers() throws SQLException;
  public boolean supportsAlterTableWithAddColumn() throws SQLException;
  public boolean supportsAlterTableWithDropColumn() throws SQLException;
  public boolean supportsANSI92EntryLevelSQL() throws SQLException;
  public boolean supportsANSI92FullSQL() throws SQLException;
  public boolean supportsANSI92IntermediateSQL() throws SQLException;
  public boolean supportsBatchUpdates() throws SQLException;
  public boolean supportsCatalogsInDataManipulation() throws SQLException;
  public boolean supportsCatalogsInIndexDefinitions() throws SQLException;
  public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException;
  public boolean supportsCatalogsInProcedureCalls() throws SQLException;
  public boolean supportsCatalogsInTableDefinitions() throws SQLException;
  public boolean supportsColumnAliasing() throws SQLException;
  public boolean supportsConvert() throws SQLException;
  public boolean supportsConvert(int arg1, int arg2) throws SQLException;
  public boolean supportsCoreSQLGrammar() throws SQLException;
  public boolean supportsCorrelatedSubqueries() throws SQLException;
  public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException;
  public boolean supportsDataManipulationTransactionsOnly() throws SQLException;
  public boolean supportsDifferentTableCorrelationNames() throws SQLException;
  public boolean supportsExpressionsInOrderBy() throws SQLException;
  public boolean supportsExtendedSQLGrammar() throws SQLException;
  public boolean supportsFullOuterJoins() throws SQLException;
  public boolean supportsGetGeneratedKeys() throws SQLException;
  public boolean supportsGroupBy() throws SQLException;
  public boolean supportsGroupByBeyondSelect() throws SQLException;
  public boolean supportsGroupByUnrelated() throws SQLException;
  public boolean supportsIntegrityEnhancementFacility() throws SQLException;
  public boolean supportsLikeEscapeClause() throws SQLException;
  public boolean supportsLimitedOuterJoins() throws SQLException;
  public boolean supportsMinimumSQLGrammar() throws SQLException;
  public boolean supportsMixedCaseIdentifiers() throws SQLException;
  public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException;
  public boolean supportsMultipleOpenResults() throws SQLException;
  public boolean supportsMultipleResultSets() throws SQLException;
  public boolean supportsMultipleTransactions() throws SQLException;
  public boolean supportsNamedParameters() throws SQLException;
  public boolean supportsNonNullableColumns() throws SQLException;
  public boolean supportsOpenCursorsAcrossCommit() throws SQLException;
  public boolean supportsOpenCursorsAcrossRollback() throws SQLException;
  public boolean supportsOpenStatementsAcrossCommit() throws SQLException;
  public boolean supportsOpenStatementsAcrossRollback() throws SQLException;
  public boolean supportsOrderByUnrelated() throws SQLException;
  public boolean supportsOuterJoins() throws SQLException;
  public boolean supportsPositionedDelete() throws SQLException;
  public boolean supportsPositionedUpdate() throws SQLException;
  public boolean supportsResultSetConcurrency(int arg1, int arg2) throws SQLException;
  public boolean supportsResultSetHoldability(int arg1) throws SQLException;
  public boolean supportsResultSetType(int arg1) throws SQLException;
  public boolean supportsSavepoints() throws SQLException;
  public boolean supportsSchemasInDataManipulation() throws SQLException;
  public boolean supportsSchemasInIndexDefinitions() throws SQLException;
  public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException;
  public boolean supportsSchemasInProcedureCalls() throws SQLException;
  public boolean supportsSchemasInTableDefinitions() throws SQLException;
  public boolean supportsSelectForUpdate() throws SQLException;
  public boolean supportsStatementPooling() throws SQLException;
  public boolean supportsStoredProcedures() throws SQLException;
  public boolean supportsSubqueriesInComparisons() throws SQLException;
  public boolean supportsSubqueriesInExists() throws SQLException;
  public boolean supportsSubqueriesInIns() throws SQLException;
  public boolean supportsSubqueriesInQuantifieds() throws SQLException;
  public boolean supportsTableCorrelationNames() throws SQLException;
  public boolean supportsTransactionIsolationLevel(int arg1) throws SQLException;
  public boolean supportsTransactions() throws SQLException;
  public boolean supportsUnion() throws SQLException;
  public boolean supportsUnionAll() throws SQLException;
  public boolean updatesAreDetected(int arg1) throws SQLException;
  public boolean usesLocalFilePerTable() throws SQLException;
  public boolean usesLocalFiles() throws SQLException;
  public boolean autoCommitFailureClosesAllResultSets() throws SQLException;
  public ResultSet getClientInfoProperties() throws SQLException;
  public ResultSet getFunctionColumns(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws SQLException;
  public RowIdLifetime getRowIdLifetime() throws SQLException;
  public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException;
}
