public class App implements test{

    interface test{
        void say();
    }

    class set implements test{

        @Override
        public void say() {
            // TODO Auto-generated method stub

        }
        
    }

    public static void main(String[] args) {
      int x =  call();
      System.out.println(x);
    }

    private static int call() {
        try{
            return 3;
        }finally{
            return 5;
        }

    }
}