import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int biggest = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(biggest< candies[i]){
                biggest = candies[i];
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= biggest);
        }
        return result;
    }
}
