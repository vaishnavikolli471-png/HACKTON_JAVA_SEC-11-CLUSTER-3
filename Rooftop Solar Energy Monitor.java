import java.util.Scanner;
class RoofTopSolarEnergyMonitor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int PanelID =sc.nextInt();
        System.out.println("Panel ID:"+PanelID);
        double EnergyGenerated=sc.nextDouble();
        System.out.println("Energy Generated:"+EnergyGenerated);
        int NumberOfSolarPanels=sc.nextInt();
        System.out.println("Number of Solar Panels:"+NumberOfSolarPanels);
        char SystemStatus=sc.next().charAt(0);
        System.out.println("System Status:"+SystemStatus);
        






    }
}