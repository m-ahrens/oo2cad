package oo2cad.cad.objects;

public class ObjectBox 
{
	private float xMin;
	private float xMax;
	private float yMin;
	private float yMax;
	
	public ObjectBox(float xMin, float xMax, float yMin, float yMax)
	{
		this.xMin = xMin;
		this.xMax = xMax;
		this.yMin = yMin;
		this.yMax = yMax;
	}
	
	public float getxMin() {
		return xMin;
	}
	public void setxMin(float xMin) {
		this.xMin = xMin;
	}
	public float getxMax() {
		return xMax;
	}
	public void setxMax(float xMax) {
		this.xMax = xMax;
	}
	public float getyMin() {
		return yMin;
	}
	public void setyMin(float yMin) {
		this.yMin = yMin;
	}
	public float getyMax() {
		return yMax;
	}
	public void setyMax(float yMax) {
		this.yMax = yMax;
	}
	
	
}
