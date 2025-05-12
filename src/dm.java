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

public final class dm implements CommandListener {
   private static ByteArrayInputStream ada;
   private static DataInputStream aea;
   private static ByteArrayOutputStream afa;
   private static DataOutputStream aga;
   private static RecordStore aha;
   private Form aia;
   private Command aja;
   private Command aka;
   private TextField ala;
   private TextField ama;
   private TextField ana;
   private TextField aoa;
   private TextField apa;
   private TextField aqa;
   private TextField ara;
   private TextField asa;
   private TextField ata;
   private TextField aua;
   public static int aaa;
   public static int aba;
   public static int aca;

   public dm() {
      (this.aia = new Form("Menu Danh Vọng")).append(this.ata = new TextField("Giờ làm danh vọng", "" + eg.ada, 2, 2));
      this.aia.append(this.aua = new TextField("Phút làm danh vọng", "" + eg.aea, 2, 2));
      this.aia.append(this.asa = new TextField("Xu cược", "" + aaa, 10, 2));
      this.aia.append(this.ala = new TextField("Tên Đối Thủ + ',': <Cách nhau bằng dấu phảy ','> ;", Code.bpa, 1024, 0));
      this.aia.append(this.ama = new TextField("Map lôi đài", "" + Code.bqa, 3, 2));
      this.aia.append(this.ana = new TextField("Khu lôi đài", "" + Code.bra, 3, 2));
      this.aia.append(this.aoa = new TextField("Map danh vọng", "" + Code.bsa, 3, 1));
      this.aia.append(this.apa = new TextField("Khu danh vọng", "" + Code.bta, 3, 1));
      this.aia.append(this.aqa = new TextField("Map Cừu Sát", "" + aba, 3, 3));
      this.aia.append(this.ara = new TextField("Khu Cừu Sát", "" + aca, 3, 3));
      this.aia.addCommand(this.aja = new Command("Lưu", 4, 1));
      this.aia.addCommand(this.aka = new Command("Hủy", 7, 1));
      this.aia.setCommandListener(this);
   }

   public final void aaa() {
      Display.getDisplay(Class_ab.aja).setCurrent(this.aia);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.aja) {
         eg.ada = Integer.parseInt(this.ata.getString());
         eg.aea = Integer.parseInt(this.aua.getString());
         aaa = Integer.parseInt(this.asa.getString());
         Code.bpa = this.ala.getString().trim();
         Code.bqa = Integer.parseInt(this.ama.getString());
         Code.bra = Integer.parseInt(this.ana.getString());
         Code.bsa = Integer.parseInt(this.aoa.getString());
         Code.bta = Integer.parseInt(this.apa.getString());
         aba = Integer.parseInt(this.aqa.getString());
         aca = Integer.parseInt(this.ara.getString());

         try {
            afa = new ByteArrayOutputStream();
            (aga = new DataOutputStream(afa)).writeInt(eg.ada);
            aga.writeInt(eg.aea);
            aga.writeInt(aaa);
            aga.writeUTF(Code.bpa);
            aga.writeInt(Code.bqa);
            aga.writeInt(Code.bra);
            aga.writeInt(Code.bsa);
            aga.writeInt(Code.bta);
            aga.writeInt(aba);
            aga.writeInt(aca);
            aga.flush();
            aga.close();
            afa.flush();
            aha = RecordStore.openRecordStore("DanhVong", true);
            byte[] var3 = afa.toByteArray();
            afa.close();
            if (aha.getNumRecords() == 0) {
               aha.addRecord(var3, 0, var3.length);
            } else {
               aha.setRecord(1, var3, 0, var3.length);
            }

            aha.closeRecordStore();
         } catch (Exception var4) {
         }

         Display.getDisplay(Class_ab.aja).setCurrent(fg.aaa());
         ab.aaa("Lưu cài đặt thành công");
      }

      if (var1 == this.aka) {
         Display.getDisplay(Class_ab.aja).setCurrent(fg.aaa());
      }

   }

   public static void aba() {
      eg.ada = 0;
      eg.aea = 0;
      aaa = 1000;
      Code.bpa = "";
      Code.bqa = 1;
      Code.bra = 22;
      Code.bsa = -1;
      Code.bta = -1;
      aba = 23;
      aca = 6;

      try {
         if ((aha = RecordStore.openRecordStore("DanhVong", true)).getNumRecords() != 0) {
            ada = new ByteArrayInputStream(aha.getRecord(1));
            eg.ada = (aea = new DataInputStream(ada)).readInt();
            eg.aea = aea.readInt();
            aaa = aea.readInt();
            Code.bpa = aea.readUTF();
            Code.bqa = aea.readInt();
            Code.bra = aea.readInt();
            Code.bsa = aea.readInt();
            Code.bta = aea.readInt();
            aba = aea.readInt();
            aca = aea.readInt();
         }

         aha.closeRecordStore();
      } catch (Exception var1) {
      }

   }

   static {
      aa.aaa(31);
      aba();
   }

   public static void aca() {
      ada = null;
      aea = null;
      afa = null;
      aga = null;
      aha = null;
      aaa = 0;
      aba = 0;
      aca = 0;
   }
}
