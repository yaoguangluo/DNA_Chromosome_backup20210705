package SVQ.stable;

import java.util.HashMap;
import java.util.Map;

//StableToken.ETL_SYMBOL_SMILL
//������shell �������
//��˼�����������������Ʊ�����һ���������룬��ô���ı�����Ӧ�����ַ����������룬�����޸���������Ӣ���������ȡ�
//������
public class StableShellETL{
	//�Ժ�ϲ� 
	public static final String SHELL_ETL_FINISH= "���";
	public static final String SHELL_ETL_CONFIG= "��������";
	public static final String SHELL_ETL_DID_CONFIG= "configured" ; //configured
	public static final String SHELL_ETL_MID_SHELL= "midShell";
	public static final String SHELL_ETL_DOWN_SHELL= "downShell";
	public static final String SHELL_ETL_TIN_SHELL_ETL= "TinShellETL";
	public static final String SHELL_ETL_JOIN_BASE_NAME= "joinBaseName";
	public static final String SHELL_ETL_SLASH= "/";
	public static final String SHELL_ETL_CONDITION= "condition";
	public static final String SHELL_ETL_CULUMNNAME= "culumnName";
	public static final String SHELL_ETL_ROWVALUE= "rowValue";
	public static final String SHELL_ETL_SMALL= "<";
	public static final String SHELL_ETL_LESS_THAN= "-lt";//����˼ά �����дд������ linux �� c shell
	public static final String SHELL_ETL_LESS_AND_EQUAL_TO= "<=";
	public static final String SHELL_ETL_LESS_AND_EQUAL_TO_R= "=<";
	public static final String SHELL_ETL_LESS_THAN_AND_EQUAL_TO= "-lte";//����˼ά �����дд������ linux �� c shell
	public static final String SHELL_ETL_DOUBLE_EQUALS= "==";
	public static final String SHELL_ETL_SIMPLE_EUQALS= "=";
	public static final String SHELL_ETL_TRIPAL_EQUALS= "===";//����˼ά �����дд������ javascript�� ȫ����
	public static final String SHELL_ETL_GREATER_AND_EQUAL_TO= ">=";
	public static final String SHELL_ETL_GREATER_AND_EQUAL_TO_R= "=>";
	public static final String SHELL_ETL_GREATER_THAN_AND_EQUAL_TO= "-gte";//����˼ά �����дд������ linux �� c shell
	public static final String SHELL_ETL_GREATER= ">";
	public static final String SHELL_ETL_GREATER_THAN= "-gt";//����˼ά �����дд������ linux �� c shell
	public static final String SHELL_ETL_STRING_LENGTH_GREATER_THAN= "�ַ������ȴ���";
	public static final String SHELL_ETL_STRING_LENGTH_LESS_THAN= "�ַ�������С��";
	public static final String SHELL_ETL_NOT_EUQAL_TO= "!=";
	public static final String SHELL_ETL_NOT_EUQAL_TO_R= "=!";
	public static final String SHELL_ETL_CONTANS= "����";
	public static final String SHELL_ETL_FILTER_BY= "���˵�";
	public static final String SHELL_ETL_DOES_NOT_CONTANS= "������";
	public static final String SHELL_ETL_EQUAL= "equal";
	public static final String SHELL_ETL_DOES_NOT_EQUALS= "!equal";
	public static final String SHELL_ETL_IN= "in"; //����˼ά �����������relational SQL �� in
	public static final String SHELL_ETL_COMDOT= ",";
	public static final String SHELL_ETL_NOT_IN= "!in";
	
	public static Map<String, String> storeValue= new HashMap<>();
}