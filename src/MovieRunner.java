import com.sun.tools.internal.ws.processor.model.ModelVisitor;

import java.util.ArrayList;

public class MovieRunner {
    public static void main(String[]args)
    { MovieRunner run=new MovieRunner();

        ArrayList<MovieEntry> allMovieList= run.getMoviesDetail();
        ArrayList<MovieEntry> movieList=run.movieReleaseDetail(allMovieList);
       // movieRelease.get(0).getActorName();
       for( MovieEntry obj:movieList){
            System.out.println("Movie Detail in which movie got release after 2000 and have actor Sahrukh and Actress kajol :" + obj.getActorName() +""
            +obj.getActressName()+"" +obj.getReleaseYear()+"" +obj.getMovieName());
        }

    }
    public ArrayList<MovieEntry> getMoviesDetail()
    {
        MovieEntry detail1= new MovieEntry("Kuch such Hota hai",
                "Shahrukh","kajol",
                1998);
        MovieEntry detail2= new MovieEntry("om shanti om",
                "Shahrukh","depika",
                2007);
        MovieEntry detail3= new MovieEntry("ddlj",
                "Shahrukh","kajol",
                1995);
        MovieEntry detail4= new MovieEntry("dilwale",
                "Shahrukh","kajol",
                2015);
        MovieEntry detail5= new MovieEntry("Myname is khan",
                "Shahrukh","kajol",
                2010);
        MovieEntry detail6= new MovieEntry("Dil bechara",
                "Sushant","sanjana",
                2020);
        ArrayList<MovieEntry> entryObj= new ArrayList<>();
        entryObj.add(detail1);
        entryObj.add(detail2);
        entryObj.add(detail3);
        entryObj.add(detail4);
        entryObj.add(detail5);
        entryObj.add(detail6);
        return entryObj;
    }
    public ArrayList< MovieEntry> movieReleaseDetail(ArrayList<MovieEntry>movieEntryArrayList)
    {

        ArrayList<MovieEntry> obj =new ArrayList<>();
        ArrayList<MovieEntry> yearRelease= new ArrayList<>();
        for (int i=0;i<movieEntryArrayList.size();i++)
        {
            if(movieEntryArrayList.get(i).getReleaseYear()>2000)
                yearRelease.add(movieEntryArrayList.get(i));
        }
        for(int i=0;i<yearRelease.size();i++){
            if((yearRelease.get(i).getActorName().equals("Shahrukh"))
                    &&(yearRelease.get(i).getActressName().equals("kajol"))) {

                obj.add(yearRelease.get(i));
            }
        }
        return obj ;
    }
}
