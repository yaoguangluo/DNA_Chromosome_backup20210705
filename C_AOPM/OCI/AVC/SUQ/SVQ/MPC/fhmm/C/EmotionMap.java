package OCI.AVC.SUQ.SVQ.MPC.fhmm.C;
import java.io.IOException;
import java.util.Map;
public interface EmotionMap{
	void IV_MotivationMap() throws IOException;
	void IV_PositiveMap() throws IOException;
	void IV_NegativeMap() throws IOException;
	void IV_TrendingMap() throws IOException;
	void IV_PredictionMap() throws IOException;
	void IV_DistinctionMap() throws IOException;
	public Map<String, Object> getPositiveMap();
	public void I_PositiveMap(Map<String, Object> positiveMap);
	public Map<String, Object> getNegativeMap();
	public void I_NegativeMap(Map<String, Object> negativeMap);
	public Map<String, Object> getMotivationMap() ;
	public void I_MotivationMap(Map<String, Object> motivationMap);
	public Map<String, Object> getTrendingMap() ;
	public void I_TrendingMap(Map<String, Object> trendingMap);
	public Map<String, Object> getPredictionMap() ;
	public void I_PredictionMap(Map<String, Object> predictionMap);
	public Map<String, Object> getDistinctionMap() ;
	public void I_DistinctionMap(Map<String, Object> distinctionMap);
}