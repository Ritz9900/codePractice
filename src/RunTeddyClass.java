/*
import java.util.ArrayList;


public class RunTeddyClass {

}
    public static void main(String[]args){
        RunTeddyClass runTeddyClass= new RunTeddyClass();
        ArrayList<TeddyDetails> allTeddies= runTeddyClass.enterAllDetail();
     //   ArrayList<TeddyDetails> teddiesInPriceRange= runTeddyClass.getTeddyByPrice(allTeddies, 300, 1000); }

    public ArrayList<TeddyDetails> enterAllDetail(){
       TeddyDetails teddyDetails1= new TeddyDetails(2,100,"Black","beautiful teddy");
       TeddyDetails teddyDetails2= new TeddyDetails(1,240,"Brown","Beautiful teddy");
       TeddyDetails teddyDetails3= new TeddyDetails(3,300,"Black","Good teddy");
       TeddyDetails teddyDetails4= new TeddyDetails(4,400,"Pink","Cute Teddy");
       TeddyDetails teddyDetails5= new TeddyDetails(4,500,"Baby Pink","Soft Teddy");
       TeddyDetails teddyDetails6= new TeddyDetails(10,600,"Dark Brown","Cute teddy");
       TeddyDetails teddyDetails7= new TeddyDetails(8,1000,"Baby brown","Large Teddy");
       ArrayList<TeddyDetails> setTeddyDetail= new ArrayList<>();
               setTeddyDetail.add(teddyDetails1);
               setTeddyDetail.add(teddyDetails2);
               setTeddyDetail.add(teddyDetails3);
               setTeddyDetail.add(teddyDetails4);
               setTeddyDetail.add(teddyDetails5);
               setTeddyDetail.add(teddyDetails6);
               setTeddyDetail.add(teddyDetails7);
               return setTeddyDetail;
    }

    public ArrayList<TeddyDetails> getTeddyByPrice(ArrayList<TeddyDetails> allTeddyDetails, int minPrice, int maxPrice){

        for(int i=0;i<allTeddyDetails.size();i++){
           prices= allTeddyDetails.get(i).getPrice();
           if(prices>minPrice && prices<maxPrice){
               allPrice=prices;
           }
        } return allPrice;



}
*/