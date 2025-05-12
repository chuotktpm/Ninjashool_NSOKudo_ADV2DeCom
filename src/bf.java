import javax.microedition.lcdui.Image;

public final class bf {
   public static co aaa;
   public static co aba;

   public static void aaa() {
      aaa = new co();
      aba = new co();
   }

   static {
      aa.aaa(10);
      aaa();
   }

   public static fs aaa(short var0) {
      fs var1;
      if ((var1 = (fs)aba.get(String.valueOf(var0))) == null) {
         var1 = new fs();
         aba.put(String.valueOf(var0), var1);
         gm var10000 = gm.aaa();
         short var2 = var0;
         gm var8 = var10000;
         fe var3 = null;

         try {
            (var3 = new fe((byte)125)).aca.writeByte(2);
            var3.aca.writeShort(var2);
            var8.aaa.aaa(var3);
         } catch (Exception var6) {
            var6.printStackTrace();
         } finally {
            var3.aca();
         }
      }

      return var1;
   }

   public static eh aba(short var0) {
      try {
         eh var1;
         if ((var1 = (eh)aaa.get(String.valueOf(var0))) == null || var1 != null && var1.aaa == null) {
            if (var1 == null) {
               var1 = new eh();
               aaa.put(String.valueOf(var0), var1);
            }

            var1.aaa = Controller.aaa(fd.aba("effect ".concat(String.valueOf(var0))));
            if (var1.aaa == null && System.currentTimeMillis() / 1000L - var1.aba > 10L) {
               var1.aba = (long)((int)(System.currentTimeMillis() / 1000L));
               if (var0 >= 0) {
                  var1.aaa = ab.aca("/eff_auto/" + var0 + ".png");
               }

               if (var1.aaa == null && cs.aba().afa) {
                  gm var10000 = gm.aaa();
                  short var2 = var0;
                  gm var10 = var10000;
                  fe var3 = null;

                  try {
                     (var3 = new fe((byte)125)).aca.writeByte(1);
                     var3.aca.writeShort(var2);
                     var10.aaa.aaa(var3);
                  } catch (Exception var7) {
                     var7.printStackTrace();
                  } finally {
                     var3.aca();
                  }

                  var1.aba = (long)((int)(System.currentTimeMillis() / 1000L));
               }
            }
         }

         return var1;
      } catch (Exception var9) {
         return null;
      }
   }

   public static void aaa(short var0, byte[] var1) {
      try {
         eh var2;
         if ((var2 = (eh)aaa.get(String.valueOf(var0))) == null) {
            var2 = new eh();
         }

         aaa.put(String.valueOf(var0), var2);
         if (var1.length > 0) {
            var2.aaa = Image.createImage(var1, 0, var1.length);
         } else {
            var2.aba = (long)((int)(System.currentTimeMillis() / 1000L));
         }
      } catch (Exception var3) {
      }
   }

   public static void aba() {
      aaa = null;
      aba = null;
   }
}
