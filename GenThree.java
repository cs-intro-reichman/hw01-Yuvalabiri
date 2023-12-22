public class Gen3{

    public static void main(String[]args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int p = (int)(Math.random() * (b - a) + a);
        int q = (int)(Math.random() * (b - a) + a);
        int r = (int)(Math.random() * (b - a) + a);
            System.out.println(p);
            System.out.println(q);
            System.out.println(r);
            int minPQ = Math.min(p, q);
            int minPR = Math.min(minPQ, r);
              System.out.println("The minimal generated number was" + " " + minPR);
        
            
        }

}
