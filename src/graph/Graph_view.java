package graph;

import java.awt.BorderLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class Graph_view extends Frame implements ActionListener,WindowListener{
	
/*	private Button button1 = new Button("BarChart");
	private Button button2 = new Button("LineChart");
*/



	public Graph_view(){
				
	     addWindowListener(this);
	     setTitle("Graph");
	     setLayout(new FlowLayout(FlowLayout.CENTER));
	     Bargraph();
	     
			
	/*     add(button1);
	     add(button2);
	     
		 button1.addActionListener(this);		 
		 button2.addActionListener(this);

	     if(a==0) {
	    	Bargraph();
	     }else if(a==1){
	    	  Linegraph();
	      }
	  */
     }
	 
	    
              
    
	public void Bargraph(){//棒グラフを作成する関数
		DefaultCategoryDataset data = new DefaultCategoryDataset();     		

     	//int id, year,ton;
		int ton;
		String name,year;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		
		try {
			while(rs.next()){
			    name = rs.getString("name");
			    year = rs.getString("year");
			    ton = rs.getInt("ton");	
			    data.addValue(ton,  name, year);
			}  //try catchで囲む
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*data.addValue(ton, "USA", "2005");
		data.addValue(500, "USA", "2006");
		data.addValue(120, "USA", "2007");
	*/
	   	  	JFreeChart chart = 
				      ChartFactory.createBarChart("Import Volume",
				                                   "Year",
				                                   "Ton",
				                                   data,
				                                   PlotOrientation.VERTICAL,
				                                   true,
				                                   false,
				                                   false);
			ChartPanel cpanel = new ChartPanel(chart);
		    add(cpanel, BorderLayout.CENTER);
		    			         
   }
	/*public void Linegraph(){//折れ線グラフを作成する関数

	     DefaultCategoryDataset data = new DefaultCategoryDataset();
	     	
			data.addValue(300, "USA", "2005");
			data.addValue(500, "USA", "2006");
			data.addValue(120, "USA", "2007");
			JFreeChart chart = 
				      ChartFactory.createLineChart("Import Volume",
				                                   "Year",
				                                   "Ton",
				                                   data,
				                                   PlotOrientation.VERTICAL,
				                                   true,
				                                   false,
				                                   false);
			
			ChartPanel cpanel = new ChartPanel(chart);
		    add(cpanel, BorderLayout.CENTER);
		*/


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	/*     		if(e.getSource() == button1){
	     			
	     			dispose();
	     			Graph_view graph = new Graph_view(0);
	     			graph.setBounds(5, 5, 700, 550);
	     			graph.setVisible(true);
				}else if(e.getSource() == button2){
					dispose();
					Graph_view graph = new Graph_view(1);
	     			graph.setBounds(5, 5, 700, 550);
	     			graph.setVisible(true);

				 }
*/


		
			
	}
	
}

