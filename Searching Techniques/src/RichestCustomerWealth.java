


public class RichestCustomerWealth {

    public static void main(String[] args) {
        RichestCustomerWealth obj = new RichestCustomerWealth();
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(obj.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {

        int Richest = 0;
        for (int row = 0; row < accounts.length; row++) {
            int currentRichest = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                currentRichest += accounts[row][col];
            }
            if(currentRichest>=Richest){
                Richest = currentRichest;
            }
        }
        return Richest;
    }
}
