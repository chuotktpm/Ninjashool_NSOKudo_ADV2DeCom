import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class ff {
   private static ev aaa;

   public static void aaa() {
      (aaa = new ev()).removeAllElements();

      try {
         ByteArrayInputStream var0 = new ByteArrayInputStream(fd.aba("V6PKS"));
         DataInputStream var1;
         int var2 = (var1 = new DataInputStream(var0)).readInt();

         for(int var3 = 0; var3 < var2; ++var3) {
            aaa.addElement(var1.readUTF());
         }

         var1.close();
         var0.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   static {
      aa.aaa(52);
      aaa();
   }

   private static void aea() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeInt(aaa.size());

         for(int var2 = 0; var2 < aaa.size(); ++var2) {
            var1.writeUTF((String)aaa.elementAt(var2));
         }

         var1.flush();
         var0.flush();
         fd.aaa("V6PKS", var0.toByteArray());
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static ev aba() {
      ev var0 = new ev();

      for(int var1 = 0; var1 < aaa.size(); ++var1) {
         var0.addElement(var1 + ". " + (String)aaa.elementAt(var1));
      }

      return var0;
   }

   public static void aaa(String var0) {
      if (!aaa.contains(var0)) {
         aaa.addElement(var0);
         aea();
      }

   }

   public static void aba(String var0) {
      if (aaa.contains(var0)) {
         aaa.removeElement(var0);
         aea();
      }

   }

   public static void aca() {
      aaa.removeAllElements();
      aea();
   }

   public static boolean aca(String var0) {
      return aaa.contains(var0);
   }

   public static void ada() {
      aaa = null;
   }
}
