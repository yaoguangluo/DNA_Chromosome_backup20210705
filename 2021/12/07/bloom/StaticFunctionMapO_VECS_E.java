package SEM.bloom;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OP.SM.AOP.MEC.SIQ.VPC.transaction.TransactionDelegate;
import OPM.ESU.admin.DBReadMode;
import OSA.shell.PL_XA_E;
import OSA.shell.XA_ShellQ_JoinRows_E;
import OSA.shell.XA_ShellQ_NestRows_E;
import OSA.shell.XA_ShellQ_Rows_E;
import OSA.shell.XA_ShellTables;
import OSI.AOP.MEC.SIQ.pletl.PLETL_E;
import OSI.AOP.VPC.rest.VPC;
import OSI.AOP.VPC.rest.VPCBackEnd;
import OSI.AOP.VPC.rest.VPCYangliaojing;
import OSI.AOP.rest.medicine.RestMedicinePort_E;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSM.shell.E_pl_XA_E;
import OSM.shell.P_AO_PLETL;
import OSM.shell.P_AO_PLTCP;
import OSM.shell.P_AO_pl_XA;
import OSM.shell.P_CO_pl_XA_XCDX_Cache;
import OSM.shell.P_CO_pl_XA_XCDX_Kernel;
import OSM.shell.P_CO_pl_XA_XCDX_Map;
import OSM.shell.P_I_CulumnsPL_XA;
import OSM.shell.P_RelationPL_XA;
import OSM.shell.Pl_XA_Command_E;
import OSM.shell.ShellReplace;

//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public class StaticFunctionMapO_VECS_E implements StaticFunctionMapO_VECS_C  {

	@Override
	public void SortStringDemo() {
		OSM.shell.SortStringDemo.main(null);
	}
	//TransactionDelegate {�߼��� Ӧ�ýӿ��ԡ�
	public Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception{
		return TransactionDelegate.transactionLogin(uEmail, uPassword);

	}
	public Map<String, Object> transactionRegister(String uEmail, String uEmailEnsure
			, String uName, String uPassword, String uPassWDEnsure, String uAddress
			, String uPhone, String uWeChat, String uQq, String uAge,String uSex) throws Exception{
		return TransactionDelegate.transactionRegister(uEmail, uEmailEnsure
				, uName, uPassword, uPassWDEnsure, uAddress
				, uPhone, uWeChat, uQq, uAge, uSex) ;

	}

	//���ƾ�������
	//DBReadMode{
	public void aCommonReadWay(App app) throws IOException {
		DBReadMode.aCommonReadWay(app);
	}
	public void readDBInTXTWay(App app) throws IOException{
		DBReadMode.readDBInTXTWay(app);
	}
	public void readDBInBaseWay(App app) throws IOException{
		DBReadMode.readDBInBaseWay(app);
	}
	public void readDBInWebWay(App app) {
		DBReadMode.readDBInWebWay(app);
	}

	public OPM.ESU.admin.PLSQLSectionPanel PLSQLSectionPanel(App app){
		return new OPM.ESU.admin.PLSQLSectionPanel(app);
		
	}
	public OPM.ESU.admin.VPCSRestPanel  VPCSRestPanel(App app){
		return  new OPM.ESU.admin.VPCSRestPanel(app);
		
	}
	public OPM.ESU.admin.YouBiaoSectionPanel YouBiaoSectionPanel(App app){
		return  new OPM.ESU.admin.YouBiaoSectionPanel(app);
		
	}

	//plsearchShell
	public OSA.shell.PL_XA_C PL_XA_C(){
		return new OSA.shell.PL_XA_E();
		
	}
	// XA_ShellQ_JoinRows_E {
	public Object selectRowsByAttributesOfJoinCondition(Map<String, Object> object) throws IOException{
		return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinCondition(object);
	}
	public Object selectRowsByAttributesOfJoinAggregation(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException, IOException{
		return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinAggregation(object) ;
	}
	public Object selectRowsByAttributesOfJoinGetCulumns(Map<String, Object> object){
		return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinGetCulumns(object);
	}
	public Object selectRowsByAttributesOfJoinRelation(Map<String, Object> object){
		return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinRelation(object);
	}

	//XA_ShellQ_NestRows_E {
	public Object selectRowsByAttributesOfNestCondition(Map<String, Object> object) throws IOException{
		return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestCondition(object);
		
	}
	public Object selectRowsByAttributesOfNestAggregation(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException, IOException{
		return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestAggregation(object);
		
	}
	public Object selectRowsByAttributesOfNestGetCulumns(Map<String, Object> object){
		return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestGetCulumns(object);
		
	}
	public Object selectRowsByAttributesOfNestRelation(Map<String, Object> object){
		return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestRelation(object);
		
	}
	//XA_ShellQ_Rows_E {
	public List<Map<String, Object>> selectRowsByAttribute(String currentDB
			, String tableName, String culmnName, Object value) throws IOException{
				return XA_ShellQ_Rows_E.selectRowsByAttribute(currentDB
						, tableName, culmnName, value);
		
	}
	public void XA_ShellQ_Rows_E_main(String[] args){
		XA_ShellQ_Rows_E.main(args);
	}
	//���쿴���·����ҵ����ݿ� û�з�ҳ���Ժ�����һ���ļ������Ϊ3000 rows 
	//һҳ���Ȳ����ˣ�shell �ò���sheets�߼���
	//������20210927
	public Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException{
		return XA_ShellQ_Rows_E.selectRowsByTablePath(tablePath, pageBegin
				, pageEnd, direction);

	}
	//db�滻shell�� 20210927
	public Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException{
		return XA_ShellQ_Rows_E.selectRowsByAttributesOfCondition(object);

	}
	//20210927 ע���� �Ժ��滻
	//����Ƴ� plsearch �﷨�� plsql �﷨ͨ�ã� ������֮���plorm ͳһһ�ַ�ʽ��չ pladmin
	public List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException, IOException{
		return XA_ShellQ_Rows_E.selectRowsByAttributesOfAggregation(object);

	}
	public Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object){
		return XA_ShellQ_Rows_E.selectRowsByAttributesOfGetCulumns(object);

	}
	//PLETL����һ�֮࣬��׼���ֳ�ȥ
	//������ 20211010
	public Object selectRowsByAttributesOfPLETL(Map<String, Object> object) throws InstantiationException, IllegalAccessException, IOException{
		return XA_ShellQ_Rows_E.selectRowsByAttributesOfPLETL(object);

	}
	public Object selectRowsByAttributesOfPLTCP(Map<String, Object> object) throws IOException{
		return XA_ShellQ_Rows_E.selectRowsByAttributesOfPLTCP(object);

	}

	//XA_ShellTables{
	//�Ȱѽӿ����㣬������20210925
	//�����ɱ�ӳ��
	public boolean addNewSearchShellTable(String tableName, JTable jtable){
		return XA_ShellTables. addNewSearchShellTable(tableName, jtable);
		
	}

	//��sonar��ʽ�ظ���������
	public Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) {
		return XA_ShellTables. getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel) ;
		
	}

	//��sonar��ʽ�ظ���������
	public Object[][] getNewSearchShellTableDataFromDefaultTableModel(DefaultTableModel defaultTableModel){
		return XA_ShellTables.getNewSearchShellTableDataFromDefaultTableModel(defaultTableModel);
		
	}

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, DefaultTableModel defaultTableModel) {
		return XA_ShellTables. getNewSearchShellTableRowsFromDefaultTableModel(spec, defaultTableModel);
		
	}

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, Object[][] tableData){
		return XA_ShellTables.getNewSearchShellTableRowsFromDefaultTableModel(spec, tableData);
		
	}

	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á�
	public boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel){
		return XA_ShellTables.addNewSearchShellTable(tableName, defaultTableModel);
		
	}

	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public boolean addNewSearchShellTableWithObjectData(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData){
				return XA_ShellTables.addNewSearchShellTableWithObjectData(tableName, defaultTableModel
						, defaultTableData);
				
			}

	//shellӳ���װ
	public boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData
			, Object[] defaultTableDataSpec){
				return XA_ShellTables.addNewSearchShellTable(tableName, defaultTableData
						, defaultTableDataSpec);
		
	}

	//Reflection map ��ͷ��ʽ�洢
	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public boolean addNewSearchShellTableWithObjectDataReflectionDBRows(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData){
				return XA_ShellTables. addNewSearchShellTableWithObjectDataReflectionDBRows(tableName, defaultTableModel
						, defaultTableData);
		
	}

	//Reflection map ��ͷ��ʽ�洢
	//shellӳ���װ
	public boolean addNewSearchShellTableReflectionDBRows(String tableName, Row[] rows
			, Object[] defaultTableDataSpec ){
				return XA_ShellTables.addNewSearchShellTableReflectionDBRows(tableName, rows
						, defaultTableDataSpec );
		
	}

	//Ȼ���������ƾ���jtable��ȫ����������ļ����� ����shell ��װ�������ݿ���ڴ�ӳ����롣
	public boolean addInitSearchShellTable(App app){
		return XA_ShellTables.addInitSearchShellTable(app);
		
	}

	//PLETL_C{
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap){
				return new PLETL_E().doNeroFlow(rightBotJTextPane, nodeView, first
						, documentFlowAddress, inputMap);
		
	}	
	//ReadChinese extends Thread implements Runnable{
	public OSI.AOP.neo.tts.ReadChinese ReadChinese(App app, A _A){
		return new OSI.AOP.neo.tts.ReadChinese(app, _A);
		
	}

	//RestMedicinePort_E {	
	public App kernel(App app, String string){
		return RestMedicinePort_E. kernel(app, string);
		
	}

	public Map<String, Object> getMedicineBookFeedbackZY(App app,String string){
		return RestMedicinePort_E.getMedicineBookFeedbackZY(app, string);
		
	}

	public Map<String, Object> getMedicineBookFeedbackXY(App app,String string) {
		return RestMedicinePort_E.getMedicineBookFeedbackXY(app, string);
		
	}

	public Map<String, Object> getMedicineBookFeedbackZT(App app, String string) {
		return RestMedicinePort_E.getMedicineBookFeedbackZT(app, string);
		
	}

	public Map<String, Object> getMedicineBookFeedbackXT(App app, String string) {
		return RestMedicinePort_E.getMedicineBookFeedbackXT(app, string);
		
	}

	public Map<String, Object> getMedicineBookFeedbackYT(App app, String string){
		return RestMedicinePort_E.getMedicineBookFeedbackYT(app, string);
		
	}

	public Map<String, Object> getMedicineBookFeedback(App app, String string) {
		return RestMedicinePort_E.getMedicineBookFeedback(app, string);
		
	}
	public Object doSearch(App app, String string){
		return RestMedicinePort_E.doSearch(app, string);
		
	}


	//VPC extends ServerVPC_Standard {
	//�𲽷������������vpcs ֮��̳С�
	public String forwardDB(App app, String string, Map<String, String> data) throws Exception {
		return VPC.forwardDB(app, string, data) ;
		
	}
	public String forwardVPC(App app, String string, Map<String, String> data) throws Exception {
		return VPC.forward(app, string,data);
		
	}

	//VPCBackEnd {
	//public static RestLoginPort restLoginPort;
	public String forwardVPCBackEnd(EmotionMap emotionMap, CogsBinaryForest_AE _A, String string, Map<String, String> data) 
			throws Exception{
		return VPCBackEnd.forward(emotionMap, _A, string, data) ;
	}
	//VPCYangliaojing {
	public String forwardVPCYangliaojing(App app, String string, Map<String, String> data)throws Exception{
		return VPCYangliaojing.forward(app, string, data);
		
	}
	public String getCode(String filePath) throws IOException{
		return VPCYangliaojing.getCode(filePath);
		
	}
	public String getFilePath(String string) {
		return VPCYangliaojing.getFilePath(string) ;
		
	}

	//OSI.AOP.VPC.server ��������

	//PL ETL shell
	//E_pl_XA_E { 
	public Map<String, Object> E_pl_XA(String plSearch, boolean mod, Map<String, Object> output) throws Exception{
		return E_pl_XA_E.E_pl_XA(plSearch, mod, output);
		
	}
	public Map<String, Object> E_pl_XA(PL_XA_E orm, boolean b, Map<String, Object> output) throws Exception{
		return E_pl_XA_E.E_pl_XA(orm, b, output);
	}

	//P_AO_pl_XA {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output) throws InstantiationException
	, IllegalAccessException, IOException{
		P_AO_pl_XA.P_AggregationLimitMap(sets, output); 
	}

	//�ֳ�ȥ
	public void P_PletlLimitMap(String[] sets, List<Map<String, Object>> obj){
		P_AO_pl_XA.P_PletlLimitMap(sets, obj);
	}
	//P_AO_PLETL {
	public void P_PletlLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException{
		P_AO_PLETL.P_PletlLimitMap(sets, output, object);
	}

	//P_AO_PLTCP {
	public void P_PltcpLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) throws IOException{
		P_AO_PLTCP.P_PltcpLimitMap(sets, output, object);
	}
	//P_CO_pl_XA_XCDX_Cache extends P_CO_pl_XA_XCDX {
	public void P_Cache(String[] sets, List<Map<String, Object>> output, String tableName, Map<String, Object> object, String condition){
		P_CO_pl_XA_XCDX_Cache.P_Cache(sets, output, tableName, object, condition);
	}

	//P_CO_pl_XA_XCDX_Kernel extends P_CO_pl_XA_XCDX {
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
	//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
	//׼��������20210406 ������
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException{
		P_CO_pl_XA_XCDX_Kernel.P_kernel(temp, readDBTableRowIndexCulumnFile, readDBTableRowIndexFile
				, reader, DBTableRowIndexPath, output, bufferRow, rowMap);
	}
	//P_kernel�ȱȸ��ƹ�����search shell����� ��Ҫ�滻�������ݿⴢֵ�� jtable����output 
	//��jtable���ݱ������ ������ݿ��dbӳ�䣬 ���������dma��ÿһ���ļ��ļ��ϣ�
	//DefaultTableModel �� Object[][] huaRuiJiJtable ��Ӧ DBTablePath
	//readDBTableRowIndexFile��Ӧ row id
	//huaRuiJiJtableCulumns ��Ӧ culumn
	//jtable  ̫�ϲ㣬������spec �ٶȻ������������object[][]  ��
	//������ 20210924
	//����һ�����⣬�ҵ�table db�Ƿ�����map �ṹ�� �Դ���ͷkey�� ��data �Ǿ��������߼�Ҫȫ���ĵ�
	public void P_kernel_search(String temp, File readDBTableRowIndexFile, int rowId, Object[] huaRuiJiJtableCulumns
			, Object[][] huaRuiJiJtable, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) throws IOException{
		P_CO_pl_XA_XCDX_Kernel.P_kernel_search(temp, readDBTableRowIndexFile, rowId, huaRuiJiJtableCulumns
				, huaRuiJiJtable, output, bufferRow, rowMap) ;
	}

	//P_CO_pl_XA_XCDX_Map extends P_CO_pl_XA_XCDX {
	//�Ժ��Ż���ͳһ�������������Ҫ��ת����2019-1-15 tin
	public   Map<String, Object> rowToRowMap(Row row){
		return P_CO_pl_XA_XCDX_Map.rowToRowMap(row );
		
	}
	//��rowToRowMap �������� RowMapToRow һ����֤��2������С����ģ�ͣ�������һ����������㡣
	//������202109302339
	public Row rowMapToRow(Map<String, Object> map){
		return P_CO_pl_XA_XCDX_Map.rowMapToRow(map);
		
	}

	//è��� ����pmap��output �����ˣ� ����һ������ȫ�����ˡ�20210927, �������ҵ��� ����web ����ģʽ���ϴ�commit��ʱ�򣬱��ر����ˣ�
	//���ùܣ���P_Map �ĳ� shellP_Map
	public void P_Map(String[] sets, List<Map<String, Object>> output, String tableName
			, Map<String, Object> object){
		P_CO_pl_XA_XCDX_Map.P_Map(sets, output, tableName, object);
	}

	//P_I_CulumnsPL_XA {
	public Object getCulumnsMapWithAs(String[] sets, Map<String, Object> row) {
		return P_I_CulumnsPL_XA.getCulumnsMapWithAs(sets, row);
		
	}
	public Object getCulumnsMap(String[] sets, Map<String, Object> row) {
		return P_I_CulumnsPL_XA.getCulumnsMap(sets, row);
		
	}
	public Object P_GetCulumnsMap(List<Map<String, Object>> obj, String[] getCulumnsValueArray){
		return P_I_CulumnsPL_XA.P_GetCulumnsMap(obj, getCulumnsValueArray);
		
	}
	//P_RelationPL_XA {
	public void P_AndMap(String[] sets, List<Map<String, Object>> obj
			, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj) {
		P_RelationPL_XA.P_AndMap(sets, obj, joinObj, object, newObj);
	}

	public void P_OrMap(String[] sets, List<Map<String, Object>> obj
			, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj
			, Map<String, Boolean> findinNewObj){
		P_RelationPL_XA.P_OrMap(sets, obj, joinObj, object, newObj, findinNewObj);
	}

	//Pl_XA_Command_E {
	public void P_SetRoot(String[] acknowledge, Map<String, Object> output) throws Exception{
		Pl_XA_Command_E.P_SetRoot(acknowledge, output) ;
	}

	public void P_BaseName(String[] acknowledge, Map<String, Object> object){
		Pl_XA_Command_E.P_BaseName(acknowledge, object);
	}

	public void P_TableName(String[] acknowledge, Map<String, Object> object){
		Pl_XA_Command_E. P_TableName(acknowledge, object);
	}


	public void P_ListNeedStart(String[] acknowledge, Map<String, Object> object) {
		Pl_XA_Command_E.P_ListNeedStart(acknowledge, object) ;
	}

	public void P_Join(String[] acknowledge, Map<String, Object> object){
		Pl_XA_Command_E.P_Join(acknowledge, object);
	}

	public void P_E(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception{
		Pl_XA_Command_E.P_E(acknowledge, object, mod) ;
	}
	//���������, ��, ׼����֤ ������


	//plsql����ִ��ָ�� ���ڼ���� ������ 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception{
		Pl_XA_Command_E. P_Check(acknowledge, object, mod);
	}
	public void P_StoreValues(String[] acknowledge, Map<String, Object> output){
		Pl_XA_Command_E. P_StoreValues(acknowledge, output);
	}
	//֮��׼����Ƴɹ����� ���� ������ bean
	public void P_fileOperations(String[] acknowledge, Map<String, Object> output){
		Pl_XA_Command_E. P_fileOperations(acknowledge, output);
	}

	//ShellReplace {
	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) throws IOException {
		new ShellReplace().replaceString(fileDirectroyPath, searchString, needReplaceString);
	}

	//�Ժ���Ƴ�map���洢��ЩString����������
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, Map<String, String> conditions) throws IOException {
		new ShellReplace(). replaceStringWithFileName(fileDirectroyPath, searchString
				, conditions) ;
	}
	//�Ժ���߳�
	public void start() throws IOException {
		new ShellReplace().start();
	}

	//�ļ�����Ӧɸѡ
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileName) throws IOException {
		new ShellReplace().replaceStringWithFileName(fileDirectroyPath, searchString
				, needReplaceString, fileName);
	}
	//�ļ���׺ɸѡ
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileType) throws IOException{
		new ShellReplace().replaceStringWithFileType(fileDirectroyPath, searchString
				, needReplaceString, fileType);
	}

	//�ļ���Сɸѡ
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException{
		new ShellReplace().replaceStringWithFileSize(fileDirectroyPath, searchString
				, needReplaceString, filesize_KB);
	}
	//�ļ���Сɸѡ
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
			, String needReplaceString, long beginLine, long endLine) throws IOException {
		new ShellReplace(). replaceStringWithFileLines(fileDirectroyPath, searchString
				, needReplaceString, beginLine, endLine);
	}
	public void mainShellReplace(String[] argv) throws IOException{
		ShellReplace.main(argv) ;
	}
	//���һ�ּ򵥵�logģʽ�ȡ�
	public void replaceStringWithLogRecording(Map<String, String> conditions) throws IOException{
		new ShellReplace().replaceStringWithLogRecording(conditions);
	}
}
