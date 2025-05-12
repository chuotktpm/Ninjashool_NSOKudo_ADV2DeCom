import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public final class bv implements CommandListener {
   private static ByteArrayInputStream aba;
   private static DataInputStream aca;
   private static ByteArrayOutputStream ada;
   private static DataOutputStream aea;
   private static RecordStore afa;
   public Form aaa = new Form("Menu Auto Chat");
   private Command aga;
   private Command aha;
   private TextField aia;
   private TextField aja;

   public static void aaa() {
      cr.aba = new String(new char[]{'m', 'o', 'd', ' ', 'b', 'y', ' ', 'c', 'ô', 'n', 'g', ' ', 'h', 'ù', 'n', 'g'});
      cr.aca = 20000L;

      try {
         if ((afa = RecordStore.openRecordStore("AutoChat", true)).getNumRecords() != 0) {
            aba = new ByteArrayInputStream(afa.getRecord(1));
            cr.aba = (aca = new DataInputStream(aba)).readUTF();
            cr.aca = aca.readLong();
         }

         afa.closeRecordStore();
      } catch (Exception var0) {
      }
   }

   static {
      aa.aaa(16);
      aaa();
   }

   public bv() {
      this.aaa.append(this.aia = new TextField("Nội dung", cr.aba, 5000, 0));
      this.aaa.append("* Lưu ý: mỗi câu cách nhau bằng dấu chấm phẩy (;)");
      this.aaa.append(this.aja = new TextField("Quãng nghỉ (milisecond)", "" + cr.aca, 500, 2));
      this.aaa.addCommand(this.aga = new Command("Lưu", 4, 1));
      this.aaa.addCommand(this.aha = new Command("Hủy", 7, 1));
      this.aaa.setCommandListener(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.aga) {
         cr.aba = this.aia.getString();
         cr.aca = Long.parseLong(this.aja.getString());

         try {
            ada = new ByteArrayOutputStream();
            (aea = new DataOutputStream(ada)).writeUTF(cr.aba);
            aea.writeLong(cr.aca);
            aea.flush();
            aea.close();
            ada.flush();
            afa = RecordStore.openRecordStore("AutoChat", true);
            byte[] var4 = ada.toByteArray();
            ada.close();
            if (afa.getNumRecords() == 0) {
               afa.addRecord(var4, 0, var4.length);
            } else {
               afa.setRecord(1, var4, 0, var4.length);
            }

            afa.closeRecordStore();
         } catch (Exception var3) {
         }

         Display.getDisplay(Class_ab.aja).setCurrent(fg.aaa());
         ab.aaa("Lưu cài đặt thành công");
      }

      if (var1 == this.aha) {
         Display.getDisplay(Class_ab.aja).setCurrent(fg.aaa());
      }

   }

   public static void aba() {
      aba = null;
      aca = null;
      ada = null;
      aea = null;
      afa = null;
   }
}
