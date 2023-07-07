public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int newFlowers = 0;

        for (int i = 0; i < flowerbed.length; i++){
            if (flowerbed[i] == 0){
                int leftSide = (i == 0? 0: flowerbed[i - 1]);
                int rightSide = (i == flowerbed.length - 1? 0: flowerbed[i + 1]);

                if (leftSide == 0 && rightSide == 0){
                    flowerbed[i] = 1;
                    newFlowers++;
                    if (newFlowers >= n) return true;
                }


            }


        }

        return newFlowers >= n;
    }
}
