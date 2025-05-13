import java.util.Random;
import java.util.Vector;

public final class cr extends Thread {
   private int ada = 0;
   public static boolean aaa;
   public static String aba;
   public static long aca;
   private static Random aea;

   public static void aaa() {
      aea = new Random();
   }

   static {
      aa.aaa(23);
      aaa();
   }

   public final void run() {
      String var2 = ";";
      String var1 = aba;
      Vector var3 = new Vector();
      if (!var1.endsWith(var2)) {
         var1 = String.valueOf(String.valueOf(String.valueOf(String.valueOf(var1)))) + var2;
      }

      int var4 = 0;

      for(int var5 = var1.indexOf(var2); var5 != -1; var5 = var1.indexOf(var2, var4)) {
         var3.addElement(var1.substring(var4, var5));
         var4 = var5 + var2.length();
      }

      String[] var8 = new String[var3.size()];
      var3.copyInto(var8);
      String[] var7 = var8;

      while(aaa) {
         ++this.ada;
         this.ada %= var7.length;
         Service.aaa().aca("" + aea.nextInt(99) + ": " + var7[this.ada]);

         try {
            Thread.sleep(aca);
         } catch (Exception var6) {
         }
      }

   }

   public static void aba() {
      aaa = false;
      aba = null;
      aca = 0L;
      aea = null;
   }
}
