import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;

public final class fo {
   public static int[][] aaa;
   private static Image[] afa;
   private static co aga;
   public short aba;
   public short aca;
   public short ada;
   public short aea;

   public static void aaa() {
      aga = new co();
   }

   static {
      aa.aaa(57);
      aaa();
   }

   public fo(int var1, int var2, int var3, int var4) {
      this.aba = (short)var1;
      this.aca = (short)var2;
      this.ada = (short)var3;
      this.aea = (short)var4;
   }

   public static void aba() {
      try {
         Enumeration var0 = aga.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            cp var2 = (cp)aga.get(var1);
            if (System.currentTimeMillis() - var2.aca > 180000L) {
               aga.remove(var1);
            }
         }

      } catch (Exception var3) {
      }
   }

   public static void aca() {
      afa = null;
      System.gc();
   }

   public static void ada() {
      afa = null;
      System.gc();
      afa = new Image[]{ab.aca("/img/Big0.png"), ab.aca("/img/Big1.png"), ab.aca("/img/Big2.png"), ab.aca("/img/Big3.png"), ab.aca("/img/Big4.png")};
      Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
   }

   public fo() {
      aga();
   }

   public static void aea() {
      new fo();
   }

   private static void aga() {
      try {
         DataInputStream var0;
         short var1;
         aaa = new int[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(fd.aba("nj_image")))).readShort()][5];

         for(int var2 = 0; var2 < var1; ++var2) {
            aaa[var2][0] = var0.readUnsignedByte();
            aaa[var2][1] = var0.readShort();
            aaa[var2][2] = var0.readShort();
            aaa[var2][3] = var0.readShort();
            aaa[var2][4] = var0.readShort();
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static void aaa(int var0, byte[] var1) {
      cp var2;
      if ((var2 = (cp)aga.get(String.valueOf(var0))) == null) {
         var2 = new cp();
         aga.put(String.valueOf(var0), var2);
      }

      var2.aaa = Controller.aaa(var1);
      if (Class_ab.aea != 1) {
         fd.aaa(String.valueOf(var0), var1);
      }

   }

   public static boolean aaa(int var0) {
      if (var0 >= aaa.length || aaa[var0][1] >= afa[aaa[var0][0]].getWidth() || aaa[var0][3] >= afa[aaa[var0][0]].getWidth() || aaa[var0][2] >= afa[aaa[var0][0]].getHeight() || aaa[var0][4] >= afa[aaa[var0][0]].getHeight()) {
         cp var1;
         if ((var1 = (cp)aga.get(String.valueOf(var0))) == null) {
            var1 = new cp();
            aga.put(String.valueOf(var0), var1);
            var1.aaa = Controller.aaa(fd.aba(String.valueOf(var0)));
            if (var1.aaa == null) {
               var1.aba = System.currentTimeMillis();
               Service.aaa().baa(var0);
            }

            return false;
         }

         if (var1.aaa != null) {
            return true;
         }

         if (var1.aaa == null && System.currentTimeMillis() - var1.aba > 60000L) {
            var1.aba = System.currentTimeMillis();
            Service.aaa().baa(var0);
            return false;
         }
      }

      return true;
   }

   public static int aba(int var0) {
      return aaa[var0][4];
   }

   public static void aaa(as var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 < aaa.length && aaa[var1][1] < afa[aaa[var1][0]].getWidth() && aaa[var1][3] < afa[aaa[var1][0]].getWidth() && aaa[var1][2] < afa[aaa[var1][0]].getHeight() && aaa[var1][4] < afa[aaa[var1][0]].getHeight()) {
         var0.aaa(afa[aaa[var1][0]], aaa[var1][1], aaa[var1][2], aaa[var1][3], aaa[var1][4], var4, var2, var3, var5);
      } else {
         cp var6;
         if ((var6 = (cp)aga.get(String.valueOf(var1))) == null) {
            var6 = new cp();
            aga.put(String.valueOf(var1), var6);
            var6.aaa = Controller.aaa(fd.aba(String.valueOf(var1)));
            if (var6.aaa == null) {
               var6.aba = System.currentTimeMillis();
               Service.aaa().baa(var1);
            }
         } else if (var6.aaa == null && System.currentTimeMillis() - var6.aba > 60000L) {
            var6.aba = System.currentTimeMillis();
            Service.aaa().baa(var1);
         }

         if (var6 != null) {
            if (var6.aaa != null) {
               var0.aaa(var6.aaa, 0, 0, var6.aaa.getWidth(), var6.aaa.getHeight(), var4, var2, var3, var5);
            }

            var6.aca = System.currentTimeMillis();
         }
      }
   }

   public static void afa() {
      aaa = null;
      afa = null;
      aga = null;
   }
}
