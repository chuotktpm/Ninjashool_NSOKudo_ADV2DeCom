import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;

public final class gb {
   public static String aaa;
   public static String aba;
   public static String aca;
   public static String ada;
   public static int aea;
   public static int afa;

   public static boolean aaa() {
      for(int var0 = 0; var0 < 4; ++var0) {
         if (fz.aka(var0) >= 4) {
            return true;
         }
      }

      return false;
   }

   public static void aba() {
      fz var0 = fz.ala();
      if (!(Code.aba instanceof ds) && ((fz)var0).aua > 9 && aaa()) {
         Vector var1 = new Vector();

         for(short var2 = 0; var2 < 4; ++var2) {
            ((Vector)var1).removeAllElements();

            int var3;
            for(var3 = 0; var3 < ((fz)var0).arrItemBag.length; ++var3) {
               gg var4;
               if ((var4 = ((fz)var0).arrItemBag[var3]) != null && var4.aaa.aaa == var2) {
                  ((Vector)var1).addElement(var4);
               }
            }

            while(((Vector)var1).size() >= 4) {
               var3 = 1;

               int var6;
               for(var6 = var2; var6 < 4 && GameScr.dya[var6] <= ((fz)var0).csa && var3 << 2 <= ((Vector)var1).size() && var3 < 16; ++var6) {
                  var3 <<= 2;
               }

               if (var3 == 1) {
                  return;
               }

               GameScr.ava().ada((int)12);
               GameScr.cwa = new gg[24];

               for(var6 = 0; var6 < var3; ++var6) {
                  Object var5 = ((Vector)var1).elementAt(0);
                  GameScr.cwa[var6] = (gg)var5;
                  ((fz)var0).arrItemBag[((gg)var5).ada] = null;
                  ((Vector)var1).removeElementAt(0);
               }

               Service.aaa().aca(GameScr.cwa);
               LockGame.aba();
               if (GameScr.cwa[0] != null) {
                  ((fz)var0).arrItemBag[GameScr.cwa[0].ada] = GameScr.cwa[0];
               }
            }
         }
      }

   }

   public static Calendar aca() {
      return Calendar.getInstance(TimeZone.getTimeZone("GMT+7"));
   }

   public static void ada() {
      aaa = "sv1.nsokudo.com";
      aba = "sv1.nsokudo.com";
      aca = "Ninjashool";
      ada = "Ninjashool";
      aea = 14444;
      afa = 14444;
   }

   static {
      aa.aaa(62);
      ada();
   }

   public static void aea() {
      aaa = null;
      aba = null;
      aca = null;
      ada = null;
      aea = 0;
      afa = 0;
   }
}
