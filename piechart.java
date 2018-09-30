/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.project;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author samue
 */
public class piechart extends JFrame
{
    public piechart(String appTitle,String chartTitle)
    {
        PieDataset dataset=createDataset();
        JFreeChart chart=createchart(dataset,chartTitle);
        ChartPanel chartPanel=new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500,300));
        setContentPane(chartPanel);
    }
    private PieDataset createDataset()
    {
        DefaultPieDataset result=new DefaultPieDataset();
        result.setValue("Male",40);
        result.setValue("Female",60);
        return result;
    }
    private JFreeChart createchart(PieDataset dataset,String title)
    {
        JFreeChart chart=ChartFactory.createPieChart3D(title, dataset, true, true, true);
        PiePlot3D plot=(PiePlot3D)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;            
    }
}
