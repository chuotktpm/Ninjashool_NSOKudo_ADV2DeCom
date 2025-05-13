import java.io.InputStream;
import javax.microedition.rms.RecordStore;

public final class fd {
   public gh aaa;
   public String aba;
   public int aca;
   public int ada;
   public int aea;
   public int afa;
   public int aga;
   public int aha;
   public static int aia;
   public static long aja;
   public static boolean aka;

   public static InputStream aaa(String var0) {
      return "".getClass().getResourceAsStream(var0);
   }

   public static void aaa(String var0, byte[] var1) {
      try {
         RecordStore var3;
         if ((var3 = RecordStore.openRecordStore("vj".concat(String.valueOf(var0)), true)).getNumRecords() > 0) {
            var3.setRecord(1, var1, 0, var1.length);
         } else {
            var3.addRecord(var1, 0, var1.length);
         }

         var3.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   public static byte[] aba(String var0) {
      try {
         RecordStore var3;
         byte[] var1 = (var3 = RecordStore.openRecordStore("vj".concat(String.valueOf(var0)), false)).getRecord(1);
         var3.closeRecordStore();
         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   public static void aaa(String var0, int var1) {
      try {
         aaa(var0, new byte[]{(byte)var1});
      } catch (Exception var2) {
      }
   }

   public static void aaa(String var0, String var1) {
      try {
         aaa(var0, var1.getBytes("UTF-8"));
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static String aca(String var0) {
      byte[] var2;
      if ((var2 = aba(var0)) == null) {
         return null;
      } else {
         try {
            return new String(var2, "UTF-8");
         } catch (Exception var1) {
            return new String(var2);
         }
      }
   }

   public static int ada(String var0) {
      byte[] var1;
      return (var1 = aba(var0)) == null ? -1 : var1[0];
   }

   private static void aea(String var0) {
      try {
         RecordStore.deleteRecordStore("vj".concat(String.valueOf(var0)));
      } catch (Exception var1) {
      }
   }

   public static void aaa() {
      aea("nj_arrow");
      aea("nj_effect");
      aea("nj_image");
      aea("nj_part");
      aea("nj_skill");
      aea("data");
      aea("dataVersion");
      aea("map");
      aea("mapVersion");
      aea("skill");
      aea("killVersion");
      aea("item");
      aea("itemVersion");
   }

   public static fd aaa(gh var0, String var1) {
      fd var2;
      (var2 = new fd()).aaa = var0;
      String[] var5 = Code.aca(var1, " ");
      var2.aba = var5[0];

      try {
         var2.ada = Integer.parseInt(var5[1]);
         var2.aca = Integer.parseInt(var5[2]);
         var2.aea = Integer.parseInt(var5[3]);
      } catch (Exception var4) {
         var2.aga = 0;
         var2.afa = 0;
      }

      try {
         var2.aga = Integer.parseInt(var5[4]);
         var2.afa = Integer.parseInt(var5[5]);
         var2.aha = Integer.parseInt(var5[6]);
      } catch (Exception var3) {
         var2.aga = 0;
         var2.afa = 0;
      }

      return var2.aca == 0 && var2.afa == 0 ? null : var2;
   }

   public final boolean aba() {
      return this.aca > 0 && Char.aka(this.aaa.aaa) > this.aea;
   }

   public final boolean aca() {
      return this.afa > 0 && Char.aka(this.aaa.aaa) < this.aha;
   }

   public final int ada() {
      return this.aca > 0 && Char.aka(this.aaa.aaa) > this.aea ? Char.aka(this.aaa.aaa) - this.aea : 0;
   }

   public final String aea() {
      return this.aba + " " + this.ada + " " + this.aca + " " + this.aea + " " + this.aga + " " + this.afa + " " + this.aha;
   }

   public static void afa() {
   }

   static {
      aa.aaa(51);
      afa();
   }

   public static void aga() {
      aia = 0;
      aja = 0L;
      aka = false;
   }
}
