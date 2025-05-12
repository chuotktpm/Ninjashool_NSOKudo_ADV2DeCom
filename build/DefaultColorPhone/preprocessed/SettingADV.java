import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

/**
 *
 * @author baomi
 */
public class SettingADV implements CommandListener{
    private static ByteArrayInputStream aja;
   private static DataInputStream aka;
   private static ByteArrayOutputStream ala;
   private static DataOutputStream ama;
   private static RecordStore ana;
   public static byte aaa;
   public static byte aba;
   public static byte aca;
   public static byte ada;
   public static byte aea;
   public static byte afa;
   public static byte aga;
   public static byte aha;
   public static byte aia;
   private final Form aoa = new Form("Cài đặt NVDV <Kudo>");
   private final Command apa = new Command("Lưu", 4, 1);
   private final Command aqa = new Command("Hủy", 3, 1);
   private final ChoiceGroup ara = new ChoiceGroup("- Tiêu diệt quái thường", 1, new String[]{"Làm NV", "Hủy NV"}, new Image[2]);
   private final ChoiceGroup asa = new ChoiceGroup("- Nâng cấp vật phẩm!", 1, new String[]{"Làm NV", "Hủy NV"}, new Image[2]);
   private final ChoiceGroup ata = new ChoiceGroup("- Chiến thắng lôi đài!", 1, new String[]{"Làm NV", "Hủy NV"}, new Image[2]);
   private final ChoiceGroup aua = new ChoiceGroup("- Cừu sát người khác!", 1, new String[]{"Làm NV", "Hủy NV", "Dừng Auto"}, new Image[3]);
   private final ChoiceGroup ava = new ChoiceGroup("- Nông dân chăm chỉ!", 1, new String[]{"Làm NV", "Hủy NV"}, new Image[2]);
   private final ChoiceGroup awa = new ChoiceGroup("- Tiêu diệt Tinh Anh", 1, new String[]{"Làm NV", "Hủy NV"}, new Image[2]);
   private final ChoiceGroup axa = new ChoiceGroup("- Tiêu diệt Thủ Lĩnh", 1, new String[]{"Làm NV", "Hủy NV"}, new Image[2]);
   private final ChoiceGroup aya = new ChoiceGroup("- Sử dụng bảo hiểm để nâng lên 7", 1, new String[]{"Dùng Bảo Hiểm", "Không Bảo Hiểm"}, new Image[2]);
   private final ChoiceGroup aza = new ChoiceGroup("- Sử dụng bảo hiểm để nâng lên 8", 1, new String[]{"Dùng Bảo Hiểm", "Không Bảo Hiểm"}, new Image[2]);
   private TextField baa;
   private TextField bba;

   public SettingADV() {
      this.baa = new TextField("Giờ điểm danh !", "" + Code.gioADV, 2, 2);
      this.bba = new TextField("Phút điểm danh !", "" + Code.phutADV, 2, 2);
   }

   public final void show() {
      this.aoa.append(this.aya);
      this.aoa.append(this.aza);
      this.aoa.append(this.baa);
      this.aoa.append(this.bba);
      this.aoa.append(this.ara);
      this.aoa.append(this.awa);
      this.aoa.append(this.axa);
      this.aoa.append(this.asa);
      this.aoa.append(this.ata);
      this.aoa.append(this.aua);
      this.aoa.append(this.ava);
      this.aoa.addCommand(this.apa);
      this.aoa.addCommand(this.aqa);
      this.aoa.setCommandListener(this);
      this.ara.setSelectedIndex(aaa, true);
      this.asa.setSelectedIndex(ada, true);
      this.ata.setSelectedIndex(aea, true);
      this.aua.setSelectedIndex(afa, true);
      this.ava.setSelectedIndex(aia, true);
      this.awa.setSelectedIndex(aba, true);
      this.axa.setSelectedIndex(aca, true);
      this.aya.setSelectedIndex(aga, true);
      this.aza.setSelectedIndex(aha, true);
      display(this.aoa);
   }

   private static void display(Displayable var0) {
      Display.getDisplay(GameMidlet.instance).setCurrent(var0);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.apa) {
         try {
            aaa = (byte)this.ara.getSelectedIndex();
            aba = (byte)this.awa.getSelectedIndex();
            aca = (byte)this.axa.getSelectedIndex();
            ada = (byte)this.asa.getSelectedIndex();
            aea = (byte)this.ata.getSelectedIndex();
            afa = (byte)this.aua.getSelectedIndex();
            aia = (byte)this.ava.getSelectedIndex();
            aha = (byte)this.aza.getSelectedIndex();
            aga = (byte)this.aya.getSelectedIndex();
            Code.gioADV = Integer.parseInt(this.baa.getString());
            Code.phutADV = Integer.parseInt(this.bba.getString());
            ala = new ByteArrayOutputStream();
            ama = new DataOutputStream(ala);

            try {
               ama.writeByte(aaa);
               ama.writeByte(aba);
               ama.writeByte(aca);
               ama.writeByte(ada);
               ama.writeByte(aea);
               ama.writeByte(afa);
               ama.writeByte(aga);
               ama.writeByte(aha);
               ama.writeByte(aia);
               ama.writeInt(Code.gioADV);
               ama.writeInt(Code.phutADV);
               ama.flush();
               ama.close();
               ala.flush();
               ana = RecordStore.openRecordStore("formdv", true);
               byte[] var3 = ala.toByteArray();
               ala.close();
               if (ana.getNumRecords() == 0) {
                  ana.addRecord(var3, 0, var3.length);
               } else {
                  ana.setRecord(1, var3, 0, var3.length);
               }

               ana.closeRecordStore();
            } catch (Exception var4) {
            }

            GameCanvas.setText("Lưu cài đặt thành công");
         } catch (NumberFormatException var5) {
         }
      }

      display(MotherCanvas.getInstance());
   }

   public static void aba() {
      afa = 1;

      try {
         if ((ana = RecordStore.openRecordStore("formdv", true)).getNumRecords() != 0) {
            aja = new ByteArrayInputStream(ana.getRecord(1));
            aka = new DataInputStream(aja);
            aaa = aka.readByte();
            aba = aka.readByte();
            aca = aka.readByte();
            ada = aka.readByte();
            aea = aka.readByte();
            aga = aka.readByte();
            aha = aka.readByte();
            afa = aka.readByte();
            aia = aka.readByte();
            Code.gioADV = aka.readInt();
            Code.phutADV = aka.readInt();
         }

         ana.closeRecordStore();
      } catch (Exception var1) {
      }

   }

   static {
      aba();
   }

   public static void aca() {
      aja = null;
      aka = null;
      ala = null;
      ama = null;
      ana = null;
      aaa = 0;
      aba = 0;
      aca = 0;
      ada = 0;
      aea = 0;
      afa = 0;
      aga = 0;
      aha = 0;
      aia = 0;
   }
}
