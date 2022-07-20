package KeywordDriven;

public class Execution {
	public static void main(String[] args) {
		String path = "E:\\Delivery\\Selenium - Java\\Framework\\TestCase.xlsx"; //Make changes respectively
		Excelutilility.setexcel(path,0);
		for(int i=1; i<=3; i++)
		{
			String keyword = Excelutilility.getdata(i, 3);//  3,  3
			if(keyword.equals("openbrowser"))
			{
				Actionkeywords.openbrowser();
			}
			else if(keyword.equals("navigate"))
			{
				Actionkeywords.navigate();
			}
			else if(keyword.equals("click"))
			{
				String data = Excelutilility.getdata(i, 4);//3,  4
				//System.out.println(data);
				Actionkeywords.click(data);
			}
		}
	}
}
