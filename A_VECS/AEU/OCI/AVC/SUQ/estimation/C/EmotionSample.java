package AEU.OCI.AVC.SUQ.estimation.C;

public class EmotionSample{
	public double getPositiveCount() {
		return positiveCount;
	}
	public void I_PositiveCount(double positiveCount) {
		this.positiveCount = positiveCount;
	}
	public double getNegativeCount() {
		return negativeCount;
	}
	public void I_NegativeCount(double negativeCount) {
		this.negativeCount = negativeCount;
	}
	public double getEmotionRatio() {
		return emotionRatio;
	}
	public void I_EmotionRatio(double emotionRatio) {
		this.emotionRatio = emotionRatio;
	}
	public double getMotivationRatio() {
		return motivationRatio;
	}
	public void I_MotivationRatio(double motivationRatio) {
		this.motivationRatio = motivationRatio;
	}
	public double getCorrelationRatio() {
		return correlationRatio;
	}
	public void I_CorrelationRatio(double correlationRatio) {
		this.correlationRatio = correlationRatio;
	}
	public double getContinusRatio() {
		return continusRatio;
	}
	public void I_ContinusRatio(double continusRatio) {
		this.continusRatio = continusRatio;
	}
	public double getTrendsRatio() {
		return trendsRatio;
	}
	public void I_TrendsRatio(double trendsRatio) {
		this.trendsRatio = trendsRatio;
	}
	public double getPredictionRatio() {
		return predictionRatio;
	}
	public void I_PredictionRatio(double predictionRatio) {
		this.predictionRatio = predictionRatio;
	}
	public double getGuessRatio() {
		return guessRatio;
	}
	public void I_GuessRatio(double guessRatio) {
		this.guessRatio = guessRatio;
	}
	public double getSensingRatio() {
		return sensingRatio;
	}
	public void I_SensingRatio(double sensingRatio) {
		this.sensingRatio = sensingRatio;
	}
	public void I_MedCount(int frequency) {
		this.medCount = frequency;
	}
	public double getMedCount() {
		return medCount;
	}
	public String getMotivation() {
		return motivation;
	}
	public void I_Motivation(String motivation) {
		this.motivation = motivation;
	}
	public String getTrending() {
		return trending;
	}
	public void I_Trending(String trending) {
		this.trending = trending;
	}
	public String getPrediction() {
		return prediction;
	}
	public void I_Prediction(String prediction) {
		this.prediction = prediction;
	}
	public void I_MedCount(double medCount) {
		this.medCount = medCount;
	}
	public String getDistinction() {
		return distinction;
	}
	public void I_Distinction(String distinction) {
		this.distinction = distinction;
	}
	double positiveCount;
	double medCount;
	double negativeCount;
	double emotionRatio;
	double motivationRatio;
	double correlationRatio;
	double continusRatio;
	double trendsRatio;
	double predictionRatio;
	double guessRatio;
	double sensingRatio;
	String motivation;
	String trending;
	String prediction;
	String distinction;
}