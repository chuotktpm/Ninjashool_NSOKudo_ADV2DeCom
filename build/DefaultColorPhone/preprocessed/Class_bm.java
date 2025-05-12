
// Source code is decompiled from a .class file using FernFlower decompiler.
import javax.microedition.lcdui.Image;

public final class Class_bm {
   public static mHashtable a = new mHashtable();
   public static mHashtable b = new mHashtable();

   public static Class_az a(short var0) {
      Class_az var1;
      if ((var1 = (Class_az)b.get(String.valueOf(var0))) == null) {
         var1 = new Class_az();
         b.put(String.valueOf(var0), var1);
         Service.getInstance().aq(var0);
      }

      return var1;
   }

   public static Class_bh b(short var0) {
      try {
         Class_bh var1;
         if ((var1 = (Class_bh)a.get(String.valueOf(var0))) == null || var1 != null && var1.a == null) {
            if (var1 == null) {
               var1 = new Class_bh();
               a.put(String.valueOf(var0), var1);
            }

            var1.a = Controller.a(RMS.getRecord("effect " + var0));
            if (var1.a == null && System.currentTimeMillis() / 1000L - var1.b > 10L) {
               var1.b = (long)((int)(System.currentTimeMillis() / 1000L));
               if (var0 >= 0) {
                  var1.a = GameCanvas.loadImage("/eff_auto/" + var0 + ".png");
               }

               if (var1.a == null && Session_ME.getInstance().connected) {
                  Service.getInstance().c(var0);
                  var1.b = (long)((int)(System.currentTimeMillis() / 1000L));
               }

               System.currentTimeMillis();
            }
         }

         return var1;
      } catch (Exception var3) {
         return null;
      }
   }

   public static void a(short var0, byte[] var1) {
      try {
         Class_bh var2;
         if ((var2 = (Class_bh)a.get(String.valueOf(var0))) == null) {
            var2 = new Class_bh();
         }

         a.put(String.valueOf(var0), var2);
         if (var1.length > 0) {
            var2.a = Image.createImage(var1, 0, var1.length);
         } else {
            var2.b = (long)((int)(System.currentTimeMillis() / 1000L));
         }

         System.currentTimeMillis();
      } catch (Exception var3) {
      }
   }
}
