package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay(){
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    private JPanel createPanel(){
        ChartPanel panel= new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return panel;
    }
    private JFreeChart createChart(DefaultCategoryDataset data){
        JFreeChart chart=ChartFactory.createBarChart("Histograma JFreeChart",
                "Nombres de dominios","Nº de dominios",data);
        return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset data=new DefaultCategoryDataset();
        data.addValue(15,"","gmail.com");
        data.addValue(20,"","ulpgc.es");
        data.addValue(3,"","ull.es");
        data.addValue(12,"","hotmail.com");
        return data;
        
    }
    public void execute(){
        setVisible(true);
    }
}
