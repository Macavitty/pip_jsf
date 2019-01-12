package faces.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="spinnerView")
@SessionScoped
public class SpinnerView {
    private double xValue, yValue;


    public double getXValue() {
        return xValue;
    }

    public void setXValue(double xValue) {
        this.xValue = xValue;
    }

    public double getYValue() {
        return yValue;
    }

    public void setYValue(double yValue) {
        this.yValue = yValue;
    }
}
