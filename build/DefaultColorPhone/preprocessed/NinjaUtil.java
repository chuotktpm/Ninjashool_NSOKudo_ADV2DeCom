
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.DataInputStream;
import java.util.Random;

public final class NinjaUtil {
   private static Random rand = new Random();

   public static int a(int var0) {
      return rand.nextInt(var0);
   }

   public static int a() {
      return -7 + rand.nextInt(14);
   }

   public static byte[] a(Message var0) {
      try {
         byte[] var1 = new byte[var0.reader().readInt()];
         var0.reader().read(var1);
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static byte[] b(Message var0) {
      try {
         byte[] var1 = new byte[var0.reader().readInt()];
         var0.reader().read(var1);
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static byte[] a(DataInputStream var0) {
      try {
         byte[] var1 = new byte[var0.readInt()];
         var0.read(var1);
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static String replace(String var0, String var1, String var2) {
      StringBuffer var3;
      int var4;
      for(var3 = new StringBuffer(); (var4 = var0.indexOf(var1)) != -1; var0 = var0.substring(var4 + var1.length())) {
         var3.append(var0.substring(0, var4) + var2);
      }

      var3.append(var0);
      return var3.toString();
   }

   public static String a(String var0) {
      String var1 = "";
      String var2 = "";
      if (var0.equals("")) {
         return var1;
      } else {
         if (var0.charAt(0) == '-') {
            var2 = "-";
            var0 = var0.substring(1);
         }

         for(int var3 = var0.length() - 1; var3 >= 0; --var3) {
            if ((var0.length() - 1 - var3) % 3 == 0 && var0.length() - 1 - var3 > 0) {
               var1 = var0.charAt(var3) + "." + var1;
            } else {
               var1 = var0.charAt(var3) + var1;
            }
         }

         return var2 + var1;
      }
   }

   public static void a(String var0, short var1) {
      Class_bd.a(var0, "sms://" + var1, new Command("", GameCanvas.b(), 88827, (Object)null), new Command("", GameCanvas.b(), 88828, (Object)null));
   }

   public static void b(String var0) {
      try {
         GameMidlet.instance.platformRequest(var0);
         return;
      } catch (Exception var3) {
         var3.printStackTrace();
      } finally {
         GameMidlet.instance.notifyDestroyed();
      }

   }

   public static String b(int var0) {
      int var1 = 0;
      if (var0 > 60) {
         var1 = var0 / 60;
         var0 %= 60;
      }

      int var2 = 0;
      if (var1 > 60) {
         var2 = var1 / 60;
         var1 %= 60;
      }

      int var3 = 0;
      if (var2 > 24) {
         var3 = var2 / 24;
         var2 %= 24;
      }

      String var4 = "";
      if (var3 > 0) {
         var4 = var4 + var3;
         var4 = var4 + "d";
         var4 = var4 + var2 + "h";
      } else if (var2 > 0) {
         var4 = var4 + var2;
         var4 = var4 + "h";
         var4 = var4 + var1 + "'";
      } else {
         if (var1 > 9) {
            var4 = var4 + var1;
         } else {
            var4 = var4 + "0" + var1;
         }

         var4 = var4 + ":";
         if (var0 > 9) {
            var4 = var4 + var0;
         } else {
            var4 = var4 + "0" + var0;
         }
      }

      return var4;
   }

   public static String[] a(String var0, String var1) {
      MyVector var2 = new MyVector();

      for(int var3 = var0.indexOf(var1); var3 >= 0; var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1)) {
         var2.addElement(var0.substring(0, var3));
      }

      var2.addElement(var0);
      String[] var5 = new String[var2.size()];
      if (var2.size() > 0) {
         for(int var4 = 0; var4 < var2.size(); ++var4) {
            var5[var4] = (String)var2.elementAt(var4);
         }
      }

      return var5;
   }
   
   public static void sleep(long l) {
       try {
          Thread.sleep(l);
       } catch (Exception var3) {
       }
 
    }
}
