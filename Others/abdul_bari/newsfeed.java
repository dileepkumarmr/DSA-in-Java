public class newsfeed {
    String[] trendingArticles;
    int[] views;
    double[] ratings;

public newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings) {
    trendingArticles = initialArticles;
    views = initialViews;
    ratings = initialRatings;

}

public String getTopArticle() {
    return trendingArticles[1];

}

public void viewArticle(int articleNumber) {
    views[articleNumber] = views[articleNumber] + 1;
    System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");

}

public void changeRating(int articleNumber, double newRating) {
    if (newRating > 5 || newRating < 0) {
        System.out.println("The rating must be between 0 and 5 stars!");
    } else {
        ratings[articleNumber] = newRating;
        System.out.println("The article '" + trendingArticles[articleNumber] + " is now rated " + ratings[articleNumber] + "stars!");

    }
}
public static void main(String[] args) {
    String[] robotArticles = {"Oil news", "Innovative motors", "Humans:Exterminate or not?", "Organic Eye Implants", "Path finding in an unkown world"};
    int[] robootViewers = {37, 90, 12, 11, 87};
    double[] robotRatings = {2.5, 3.2, 2.0, 5.0, 4.3};
    newsfeed robotTimes = new newsfeed(robotArticles, robootViewers, robotRatings);

        robotTimes.viewArticle(3);
        robotTimes.viewArticle(3);
        robotTimes.viewArticle(3);
        System.out.println("The top artice is " + robotTimes.getTopArticle());
        robotTimes.changeRating(4,4);        
}
    
}
