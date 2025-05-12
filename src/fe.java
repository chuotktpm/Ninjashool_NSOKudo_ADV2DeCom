import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class fe {
   public byte aaa;
   ByteArrayOutputStream aba = null;
   DataOutputStream aca = null;
   private ByteArrayInputStream aea = null;
   DataInputStream ada = null;

   public fe() {
   }

   public fe(byte var1) {
      this.aaa = var1;
      this.aba = new ByteArrayOutputStream();
      this.aca = new DataOutputStream(this.aba);
   }

   public fe(byte var1, byte[] var2) {
      this.aaa = var1;
      this.aea = new ByteArrayInputStream(var2);
      this.ada = new DataInputStream(this.aea);
      Code.aaa(var1, var2);
   }

   private byte[] ada() {
      return this.aba.toByteArray();
   }

   public final DataInputStream aaa() {
      return this.ada;
   }

   public final DataOutputStream aba() {
      return this.aca;
   }

   public final void aca() {
      try {
         if (this.ada != null) {
            this.ada.close();
         }

         if (this.aca != null) {
            this.aca.close();
         }

      } catch (IOException var1) {
      }
   }
}
