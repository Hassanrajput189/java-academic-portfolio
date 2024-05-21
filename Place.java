public class Place{
    String name;
    String address;
    long calculatePopulation[];
    Place(String name,String address,long calculatePopulation[]){
        this.name = name;
        this.address = address;     
    }
    public String getName(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public long getCalPop(){
        return calculatePopulation;
    }
    public void firstPlace(){
        System.out.println("This is first place");
    }
    public void secondPlace(){
        System.out.println("This is second place");
    }
    public long calculatePopulation(){
        long total = 0;
        for(int i =0;i<calculatePopulation.length;i++){
            total+=calculatePopulation[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Long PopArray[] = {20000,20000};
        Long popArrayofamz[] ={1000,1999};
        Place p = new Place("Rani Bagh", "dont know", PopArray);
        Ammusement a = new Ammusement("Name", "hotel Name", "Water park name",popArrayofamz);
        a.calculatePopulation();
    }
}
 class Ammusement {
    String ammuzementPark;
    String hotels;
    String waterpark;
    long calculatePopulationofAmz[];
    Ammusement(String ammuzementPark,String hotels,String waterpark,Long calpopofAmz[]){
        this.ammuzementPark = ammuzementPark;
        this.hotels = hotels;
        this.waterpark = waterpark;
    }
    public void ammuzementPark1(){
        System.out.println("This is Ammuzement park 1");
    }
    public void ammuzementPark2(){
        System.out.println("This is Ammuzement park 2");
    }
    public String getammuzement(){
        return ammuzementPark;
    }
    public String gethotel(){
        return hotels;
    }
    public long getCalPop(){
        return calculatePopulationofAmz;
    }
    @Override
    public Long calculatePopulation(){
        Long total = 0;
        for(int i =0;i<calculatePopulationofAmz.length;i++){
            total +=calculatePopulationofAmz[i];
        }
        return total;
    }
}
