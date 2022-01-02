package SEM.bloom;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.sun.java.accessibility.util.Translator;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ME.APM.VSQ.App;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.PLSQLCommand_E;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_AggregationPLSQL;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_ConditionPLSQL_XCDX_Cache;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_ConditionPLSQL_XCDX_Kernel;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_ConditionPLSQL_XCDX_Map;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_ConditionPLSQL_XCDX_Table;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_GetCulumnsPLSQL;
import ME.SM.OP.SM.AOP.MEC.SIQ.E.P_RelationPLSQL;
import ME.utils.WordForestUtil;
import ME.utils.WordFrequencyUtil;
import MS.VPC.V.Forward_V;
import MS.VPC.V.RestMap;
import MS.VPC.V.RestMap_V;
import MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E.D_Rows_E;
import MSI.OP.SM.AOP.MEC.SIQ.SM.OSI.E.I_Tables_E;
import MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E;
import MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.Q_JoinRows_E;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import MSU.OP.SM.AOP.MEC.SIQ.SM.update.E.U_JoinRows_E;
import MSU.OP.SM.AOP.MEC.SIQ.SM.update.E.U_Rows_E;
import MSV.OSU.array.ArrayValidation;
import MSV.OSU.date.DateValidation;
import MVQ.button.CfxButton;
import MVQ.label.DetaLabel;
import MVQ.tableRender.ColorTableRender;
import MVQ.textpane.CfxTextPane;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
//����tinshell 002 ��pletlԴ�룬׼������shell ���򣬺�shell ����ִ��
//24��Ԫ������ dna�����������Ŵ� ��ʽ ���롶DNA Ԫ���߻����ļ��� �����޶��桷�� �Ժ���������Ȩ��
public class StaticFunctionMapM_VECS_E implements StaticFunctionMapM_VECS_C {
	public Map<String, String> annotationMap= new HashMap<>();
	//database
	//static
	//U_JoinRows_E {
	public Object updateRowsByAttributesOfJoinCondition(Map<String, Object> object, boolean mod) 
			throws IOException{
		return U_JoinRows_E.updateRowsByAttributesOfJoinCondition(object, mod);
	}
	public Object updateRowsByAttributesOfJoinAggregation(Map<String, Object> object, boolean mod){
		return U_JoinRows_E. updateRowsByAttributesOfJoinAggregation(object, mod);
	}
	public Object updateRowsByAttributesOfJoinGetCulumns(Map<String, Object> object){
		return U_JoinRows_E.updateRowsByAttributesOfJoinGetCulumns(object);
	}
	public Object updateRowsByAttributesOfJoinRelation(Map<String, Object> object, boolean mod){
		return U_JoinRows_E.updateRowsByAttributesOfJoinRelation(object, mod);
	}

	//Q_JoinRows_E {
	public Object selectRowsByAttributesOfJoinCondition(Map<String, Object> object) throws IOException {
		return Q_JoinRows_E.selectRowsByAttributesOfJoinCondition(object);
	}
	public Object selectRowsByAttributesOfJoinAggregation(Map<String, Object> object){
		return Q_JoinRows_E.selectRowsByAttributesOfJoinAggregation(object);
	}
	public Object selectRowsByAttributesOfJoinGetCulumns(Map<String, Object> object){
		return Q_JoinRows_E.selectRowsByAttributesOfJoinGetCulumns(object);
	}
	public Object selectRowsByAttributesOfJoinRelation(Map<String, Object> object){
		return Q_JoinRows_E.selectRowsByAttributesOfJoinRelation(object);
	}

	//IU_Rows_E {
	public Map<String, Object> insertRowByTablePathAndIndex(String tablePath, String pageIndex
			, JSONObject culumnOfNewRow)
			throws FileNotFoundException, IOException{
		return IU_Rows_E. insertRowByTablePathAndIndex(tablePath, pageIndex, culumnOfNewRow);
	}
	public Map<String, Object> insertRowByBaseName(String baseName, String tableName, JSONObject jsobj
			, boolean mod) 
			throws Exception{
		return IU_Rows_E. insertRowByBaseName(baseName, tableName, jsobj, mod);
	}
	public void IU_RowByAttributes(Map<String, Object> object, boolean mod) throws Exception{
		IU_Rows_E.IU_RowByAttributes(object, mod);
		return ;
	}

	//I_Tables_E {
	public void I_Table(Map<String, Object> object, boolean mod) throws Exception{
		I_Tables_E.I_Table(object, mod);
	}

	//D_Rows_E {
	public Map<String, Object> deleteRowByTablePathAndIndex(String tablePath, String pageIndex, boolean mod)
			throws FileNotFoundException, IOException{
		return D_Rows_E. deleteRowByTablePathAndIndex(tablePath, pageIndex, mod);
	}
	public void D_RowByAttributesOfCondition(Map<String, Object> object, boolean mod) throws IOException{
		D_Rows_E.D_RowByAttributesOfCondition(object, mod);
	}


	//U_Rows_E {
	public Map<String, Object> updateRowByTablePathAndIndex(String tablePath, String pageIndex,JSONObject jaculumnOfUpdateRow) 
			throws FileNotFoundException, IOException{
		return U_Rows_E. updateRowByTablePathAndIndex(tablePath, pageIndex, jaculumnOfUpdateRow);
	}
	public Map<String, Object> updateRowByTablePathAndAttribute(String tablePath, String culumnName, String culumnValue
			, JSONObject jobj) throws IOException{
		return U_Rows_E. updateRowByTablePathAndAttribute(tablePath, culumnName, culumnValue, jobj);
	}
	public Object updateRowsByRecordConditions(Map<String, Object> object, boolean mod) throws IOException{
		return U_Rows_E. updateRowsByRecordConditions(object, mod);
	}
	public Object updateRowsByAttributesOfCondition(Map<String, Object> object, boolean mod) throws IOException{
		return U_Rows_E.updateRowsByAttributesOfCondition(object, mod);
	}
	public List<Map<String, Object>> updateRowsByAttributesOfAggregation(Map<String, Object> object, boolean mod){
		return U_Rows_E.updateRowsByAttributesOfAggregation(object, mod);
	}
	public Object updateRowsByAttributesOfGetCulumns(Map<String, Object> object){
		return U_Rows_E.updateRowsByAttributesOfGetCulumns(object);
	}

	//E_PLSQL_E {
	public Map<String, Object> E_PLSQL(String plsql, boolean mod) throws Exception{
		return E_PLSQL_E. E_PLSQL(plsql, mod);
	}
	public Map<String, Object> E_PLORM(PLORM_C orm, boolean b) throws Exception{
		return E_PLSQL_E.E_PLORM(orm, b);
	}

	//P_AggregationPLSQL {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output){
		P_AggregationPLSQL.P_AggregationLimitMap(sets, output);
	}

	//P_ConditionPLSQL_XCDX_Cache extends P_ConditionPLSQL_XCDX {
	public void P_Cache(String[] sets, List<Map<String, Object>> output, String tableName, String baseName
			, Map<String, Object> object){
		P_ConditionPLSQL_XCDX_Cache.P_Cache(sets, output, tableName, baseName, object);
	}

	//P_ConditionPLSQL_XCDX_Kernel extends P_ConditionPLSQL_XCDX {
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
	//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
	//׼��������20210406 ������
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile, BufferedReader reader
			, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) 
					throws IOException{
		P_ConditionPLSQL_XCDX_Kernel.P_kernel(temp, readDBTableRowIndexCulumnFile, readDBTableRowIndexFile, reader
				, DBTableRowIndexPath, output, bufferRow, rowMap)  ;
	}

	//P_ConditionPLSQL_XCDX_Map extends P_ConditionPLSQL_XCDX {
	//�Ժ��Ż���ͳһ�������������Ҫ��ת����2019-1-15 tin
	public Map<String, Object> rowToRowMap(Row row){
		return P_ConditionPLSQL_XCDX_Map.rowToRowMap(row);
	}
	public void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath){
		P_ConditionPLSQL_XCDX_Map. P_Map(sets, output, dBTablePath);
	}

	//P_ConditionPLSQL_XCDX_Table extends P_ConditionPLSQL_XCDX {
	//plsql���溯����ȡ��ʼ��� ������ 20210405  //����� ����һ��û�ж� �����plsql����,��׼���Ա���history
	//object ָ���ջ
	//output ������
	public void P_Table(String[] sets, List<Map<String, Object>> output, String DBTablePath, Map<String, Object> object) 
			throws IOException{
		P_ConditionPLSQL_XCDX_Table.P_Table(sets, output, DBTablePath, object);
	}

	//P_GetCulumnsPLSQL {
	public Object getCulumnsMapWithAs(String[] sets, Map<String, Object> row){
		return P_GetCulumnsPLSQL. getCulumnsMapWithAs(sets, row);
	}
	public Object getCulumnsMap(String[] sets, Map<String, Object> row){
		return P_GetCulumnsPLSQL.getCulumnsMap(sets, row);
	}
	public Object P_GetCulumnsMap(List<Map<String, Object>> obj, String[] getCulumnsValueArray){
		return P_GetCulumnsPLSQL. P_GetCulumnsMap(obj, getCulumnsValueArray);
	}

	//P_RelationPLSQL {
	public void P_AndMap(String[] sets, List<Map<String, Object>> obj, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj){
		P_RelationPLSQL. P_AndMap(sets, obj, joinObj, object, newObj);
	}

	public void P_OrMap(String[] sets, List<Map<String, Object>> obj, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj, Map<String, Boolean> findinNewObj){
		P_RelationPLSQL. P_OrMap(sets, obj, joinObj, object, newObj, findinNewObj);
	}

	//PLSQLCommand_E {
	public void P_SetRoot(String[] acknowledge, Map<String, Object> output) throws Exception{
		PLSQLCommand_E.P_SetRoot(acknowledge, output);
	}
	public void P_BaseName(String[] acknowledge, Map<String, Object> object){
		PLSQLCommand_E.P_BaseName(acknowledge, object);
	}
	public void P_TableName(String[] acknowledge, Map<String, Object> object){
		PLSQLCommand_E. P_TableName(acknowledge, object);
	}
	public void P_ListNeedStart(String[] acknowledge, Map<String, Object> object){
		PLSQLCommand_E.P_ListNeedStart(acknowledge, object);
	}
	public void P_Join(String[] acknowledge, Map<String, Object> object){
		PLSQLCommand_E. P_Join(acknowledge, object);
	}
	public void P_E(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception{
		PLSQLCommand_E. P_E(acknowledge, object, mod)  ;
	}
	//plsql����ִ��ָ�� ���ڼ���� ������ 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception{
		PLSQLCommand_E.P_Check(acknowledge, object, mod)  ;
	}

	//WordForestUtil {
	public void wordsForestNotContainsKey(Map<String, WordFrequency> outputList, String countWordNode, StringBuilder[] prefixWord){
		WordForestUtil. wordsForestNotContainsKey(outputList, countWordNode, prefixWord);
	}
	public void prefixWordEqualZero(Map<String, WordFrequency> outputList,String countWordNode, StringBuilder[] prefixWord){
		WordForestUtil.prefixWordEqualZero(outputList, countWordNode, prefixWord);
	}
	public void wordsForestContainsKey(Map<String, WordFrequency> outputList,String countWordNode, StringBuilder[] prefixWord){
		WordForestUtil.wordsForestContainsKey(outputList, countWordNode, prefixWord);
	}

	//WordFrequencyUtil {
	public void WordFrequencyFindCheck(Map<String, WordFrequency> outputList,StringBuilder[] fixWords){
		WordFrequencyUtil.WordFrequencyFindCheck(outputList, fixWords);
	}
	public void WordFrequencyCompareCheck(Map<String, WordFrequency> outputList, StringBuilder[] fixWords, String countWordNode){
		WordFrequencyUtil.WordFrequencyCompareCheck(outputList, fixWords, countWordNode);
	}

	//SessionValidation{
	//���м��, ���ڲ�����������û�л���������������.
	//�û�ע��, FullDNATokenPDI ����Ŀ��������DNA������, ��dna��������Ҳ������, ����, ���Ҫ��, ������޸�.
	public boolean sessionCheck(Token token, TokenCerts tokenCerts){
		return new SessionValidation().sessionCheck(token, tokenCerts);
	}

	//����ʹ��һ�α��������
	public Token sessionTokenUpdateByDNA(String password){
		return new SessionValidation().sessionTokenUpdateByDNA(password);
	}

	//���г�ʼ����
	//���Խ������ʱ�䶼���������humanWordsPassword��, ����ʱ��Ͳ���Ҫ�ȶ���.
	//�ҽ�������ũ��͵��.
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword, boolean bys, String lockBys){
		return new SessionValidation(). sessionTokenCertsInitWithHumanWordsByDNA(humanWordsPassword, bys, lockBys);
	}
	//���������etl���Ժ�ȥ�� ������20211107 �õ�initonETLSect;
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA_ETL(String humanWordsPassword, boolean bys, String lockBys){
		return new SessionValidation().sessionTokenCertsInitWithHumanWordsByDNA_ETL(humanWordsPassword, bys, lockBys);
	}

	//����PDI��ʼ�����߷�Util����
	public Token sessionInitByTokenPDICertsDNA(TokenCerts tokenCerts){
		return new SessionValidation().sessionInitByTokenPDICertsDNA(tokenCerts);
	}
	//���г�ʼ����
	public Token sessionInitByTokenCertsDNA(TokenCerts tokenCerts){
		return new SessionValidation().sessionInitByTokenCertsDNA(tokenCerts);
	}

	//���� �������ļ��
	public boolean sessionCheckWithOrderPDSKey(Token token, TokenCerts tokenCerts){
		return new SessionValidation().sessionCheckWithOrderPDSKey(token, tokenCerts);
	}

	//���� �������ļ��
	public boolean sessionCheckWithPostPDSKey(Token token, TokenCerts tokenCerts){
		return new SessionValidation().sessionCheckWithPostPDSKey(token, tokenCerts);
	}

	//ArrayValidation{
	//�Ժ� validation������� check��fix�� 2�����֡�
	public boolean arrayIntCheck(int[] array, int min, int max){
		return ArrayValidation. arrayIntCheck(array, min, max);
	}
	public int[] arrayIntFix(int[] array, int min, int max){
		return ArrayValidation.arrayIntFix(array, min, max);
	}
	public boolean arrayLongCheck(long[] array, long min, long max){
		return ArrayValidation.arrayLongCheck(array, min, max);
	}
	public long[] arrayLongFix(long[] array, long min, long max){
		return ArrayValidation.arrayLongFix(array, min, max);
	}
	public boolean arrayDoubleCheck(double[] array, double min, double max){
		return ArrayValidation.arrayDoubleCheck(array, min, max);
	}
	public double[] arrayDoubleFix(double[] array, double min, double max){
		return ArrayValidation.arrayDoubleFix(array, min, max);
	}
	public boolean arrayFloatCheck(float[] array, float min, float max){
		return ArrayValidation.arrayFloatCheck(array, min, max);
	}
	public float[] arrayFloatFix(float[] array, float min, float max){
		return ArrayValidation.arrayFloatFix(array, min, max);
	}

	//DateValidation{
	public boolean currentSystemTimeCheck(long offsetUTC8, long miliSecondsDistinction) throws IOException{
		return DateValidation.currentSystemTimeCheck(offsetUTC8, miliSecondsDistinction);
	}
	public long currentSystemTimeToUTC(long offsetUTC8){
		return DateValidation.currentSystemTimeToUTC(offsetUTC8);
	}

	//Translator
	public Translator getTranslator(){
		return null;
	}

	//ListValidation{
	public boolean ListSetsCheck(List<Object> list, String setsType){
		return false;
	}
	public List<Object> ListSetsFix(List<Object> list, String setsType){
		return null;
	}

	//MatrixValidation{
	public boolean matrixCheck(Object[][] objects, String attribute){
		return false;
	}
	public Object[][] matrixFix(Object[][] objects, String attribute){
		return null;
	}

	//NullObject{
	public String checkNULL(Object object){
		return null;
	}
	public CfxButton getCfxButton(String string, final int x, final int y, java.awt.Color c){
		return new CfxButton(string, x, y, c);
	}

	//��������������ļ����������½ܸ���һ��csharp�İ�ť�߿���˸���ƣ� ���������� ����ɭ��ţ��Ȼ ���Ұ�������Ը��ˣ�����2014�����etl�� �ָť�����ʱ��
	//�ȸ�������stackoverflow �� �׹���sun�Ĺٷ� demo��ô��� ��̬�����������������������detasplit �������ʱ�����߸��񾭾�����ʹ,����2���¾�ֹͣ��
	//һֹͣ�ҾͲ�ʹ�ˣ�Ī��ǰ����ʱ������ȥ�������Ի�//�����ڻ����л��ڵ�ı�Ե���˱Ƚϳ�ı�Ե��
	//������2016-7��֮���ҿ�ʼ�����������, ���һ�κ����½�˵����201���� һ������ �ڹ�����ͨip��ô������վ��������һ�� �����ǣ��Ͱ��Ҹ�ɾ�ˡ�
	public MVQ.button.DetaButton DetaButton(String string, final int x, final int y, java.awt.Color c){
		return new MVQ.button.DetaButton(string, x, y, c);
	}
	public MVQ.button.YLJShowButton YLJShowButton(String string, final int x, final int y, java.awt.Color c){
		return new MVQ.button.YLJShowButton(string, x, y, c);
	}

	//DetaIndexLabel extends JLabel implements MouseListener{
	public MVQ.label.DetaIndexLabel DetaIndexLabel(String name, List<DetaLabel> jFrameList){
		return new MVQ.label.DetaIndexLabel(name, jFrameList);
	}
	//DetaLabel extends JLabel{

	public MVQ.label.DetaLabel DetaLabel(String name){
		return new  MVQ.label.DetaLabel(name);
	}

	//DetaSlider extends JSlider{
	public MVQ.slider.DetaSlider DetaSlider(final int x, final int y){
		return new  MVQ.slider. DetaSlider(x,  y);
	}

	//MVQ.tabbedpane 
	public MVQ.tabbedpane.DetabbedPane DetabbedPane(final int x, final int y, java.awt.Color c){
		return new MVQ.tabbedpane.DetabbedPane (x, y, c);
	}

	//ColorTableRender
	public ColorTableRender getColorTableRender(){
		return new ColorTableRender();
	}

	//CfxTextArea extends JTextArea {
	public MVQ.textarea.CfxTextArea CfxTextArea(String string, final int x, final int y, java.awt.Color c){
		return new MVQ.textarea.CfxTextArea (string, x, y, c);
	}


	//MVQ.textfield;
	public MVQ.textfield.CfxTextField CfxTextField(String string, final int x, final int y, java.awt.Color c){
		return new MVQ.textfield.CfxTextField(string, y, y, c);
	}

	//MVQ.textpane;
	public CfxTextPane CfxTextPane(String string, final int x, final int y, java.awt.Color c){
		return new MVQ.textpane.CfxTextPane(string,  x,  y, c);
	}

	//vpcs

	//Forward_V extends ServerForward_Standard{
	public void forwardToRestMap(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception{
		Forward_V.forwardToRestMap(app, vPCSRequest, vPCSResponse);
	}

	//RestMap_V extends ServerRestMap_Standard {
	public void P_Rest(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception{
		RestMap_V. P_Rest(app, vPCSRequest, vPCSResponse);
	}	
	public void P_RestDB(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception{
		RestMap_V.P_RestDB(app, vPCSRequest, vPCSResponse);
	}

	//RestMap extends ServerForward_Standard{
	public void P(String[] type, Socket socket, CogsBinaryForest_AE _A, EmotionMap emotionMap) throws IOException{
		RestMap.P(type, socket, _A, emotionMap);
	}

	//un static
}