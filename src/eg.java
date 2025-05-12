import java.io.InputStream;

public final class eg implements ag {
   private static eg aia;
   public static boolean aaa;
   public static int aba;
   public static long aca;
   public static int ada;
   public static int aea;
   public static bv afa;
   public static boolean aga;
   private static String aja;
   private static String aka;
   private static String ala;
   public static int aha;

   public static eg aaa() {
      if (aia == null) {
         aia = new eg();
      }

      System.gc();
      return aia;
   }

   private static String aaa(String var0) {
      InputStream var3 = fd.aaa("/".concat(String.valueOf(var0)));

      try {
         byte[] var1 = new byte[var3.available()];
         var3.read(var1);
         var0 = new String(var1, "UTF-8");
      } catch (Exception var2) {
         var0 = "";
      }

      return var0;
   }

   public final void aaa(int var1, Object var2) {
      if (var1 == 1) {
         ab.bka.aaa("Tốc độ NextMap", new ca("Đặt", aaa(), 2, (Object)null), 1);
         ab.bka.aaa.aaa(String.valueOf(aba));
      } else if (var1 == 2) {
         var1 = aba;

         try {
            var1 = Integer.parseInt(ab.bka.aaa.aea());
         } catch (Exception var3) {
         }

         if (var1 > 0 && var1 <= 99) {
            aba = var1;
            fd.aaa("nextmap", String.valueOf(aba));
         } else {
            gf.aca("Tốc độ nextmap từ 1 đến 99");
         }

         ab.ama();
      } else if (var1 == 3) {
         ab.bka.aaa("Màu nền Background", new ca("Đặt", aaa(), 4, (Object)null), 1);
         ab.bka.aaa.aaa(String.valueOf(aha));
      } else if (var1 == 4) {
         var1 = aha;

         try {
            var1 = Integer.parseInt(ab.bka.aaa.aea());
         } catch (Exception var4) {
         }

         if (var1 >= -1 && var1 <= 16777216) {
            aha = var1;
            fd.aaa("background", String.valueOf(aha));
         } else {
            gf.aca("Màu nền từ -1 đến 16777216");
         }

         ab.ama();
      } else if (var1 == 5) {
         String var5 = aaa("hd.txt");
         gf.ava().aaa("Hướng dẫn", var5, true);
      }
   }

   public static void aba() {
   }

   static {
      aa.aaa(38);
      aba();
   }

   public static void aca() {
      aia = null;
      aaa = false;
      aba = 0;
      aca = 0L;
      ada = 0;
      aea = 0;
      afa = null;
      aga = false;
      aja = null;
      aka = null;
      ala = null;
      aha = 0;
   }
}
