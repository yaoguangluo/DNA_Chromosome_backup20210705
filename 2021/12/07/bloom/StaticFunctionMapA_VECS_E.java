package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import OEI.ME.analysis.E.CogsBinaryForest_AE;
//������������ ע����
//������
public class StaticFunctionMapA_VECS_E implements StaticFunctionMapA_VECS_C{
	@Override
	public List<String> parserMixedStringToList(String inputString) throws IOException {
		CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		List<String> sets = new ArrayList<>();
		sets= _A.parserMixedString(inputString);
		//������
		return sets;
	}

	@Override
	public List<String> posReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> dnnReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> mindReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> emotionReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> educationReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}