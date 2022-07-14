package io.bavs.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogBank.Adapter.class)
public enum CatalogBank {
  
  NUMBER_40138(40138),
  
  NUMBER_40133(40133),
  
  NUMBER_40062(40062),
  
  NUMBER_90638(90638),
  
  NUMBER_40103(40103),
  
  NUMBER_90659(90659),
  
  NUMBER_40128(40128),
  
  NUMBER_40127(40127),
  
  NUMBER_37166(37166),
  
  NUMBER_40030(40030),
  
  NUMBER_40002(40002),
  
  NUMBER_40154(40154),
  
  NUMBER_37006(37006),
  
  NUMBER_40137(40137),
  
  NUMBER_40160(40160),
  
  NUMBER_40152(40152),
  
  NUMBER_37019(37019),
  
  NUMBER_40147(40147),
  
  NUMBER_40106(40106),
  
  NUMBER_37009(37009),
  
  NUMBER_40072(40072),
  
  NUMBER_91872(91872),
  
  NUMBER_40058(40058),
  
  NUMBER_40060(40060),
  
  NUMBER_2001(2001),
  
  NUMBER_40129(40129),
  
  NUMBER_40145(40145),
  
  NUMBER_40012(40012),
  
  NUMBER_40112(40112),
  
  NUMBER_90677(90677),
  
  NUMBER_90683(90683),
  
  NUMBER_90648(90648),
  
  NUMBER_90630(90630),
  
  NUMBER_40143(40143),
  
  NUMBER_90631(90631),
  
  NUMBER_90901(90901),
  
  NUMBER_90903(90903),
  
  NUMBER_40130(40130),
  
  NUMBER_40140(40140),
  
  NUMBER_90652(90652),
  
  NUMBER_40126(40126),
  
  NUMBER_90680(90680),
  
  NUMBER_40124(40124),
  
  NUMBER_40151(40151),
  
  NUMBER_90606(90606),
  
  NUMBER_90616(90616),
  
  NUMBER_90634(90634),
  
  NUMBER_90689(90689),
  
  NUMBER_90685(90685),
  
  NUMBER_90601(90601),
  
  NUMBER_90636(90636),
  
  NUMBER_37168(37168),
  
  NUMBER_40021(40021),
  
  NUMBER_40155(40155),
  
  NUMBER_40036(40036),
  
  NUMBER_90902(90902),
  
  NUMBER_40150(40150),
  
  NUMBER_40136(40136),
  
  NUMBER_90686(90686),
  
  NUMBER_40059(40059),
  
  NUMBER_40110(40110),
  
  NUMBER_90653(90653),
  
  NUMBER_90670(90670),
  
  NUMBER_90602(90602),
  
  NUMBER_40042(40042),
  
  NUMBER_40158(40158),
  
  NUMBER_90600(90600),
  
  NUMBER_40108(40108),
  
  NUMBER_40132(40132),
  
  NUMBER_90613(90613),
  
  NUMBER_37135(37135),
  
  NUMBER_90684(90684),
  
  NUMBER_40148(40148),
  
  NUMBER_90620(90620),
  
  NUMBER_40156(40156),
  
  NUMBER_40014(40014),
  
  NUMBER_40044(40044),
  
  NUMBER_40157(40157),
  
  NUMBER_90646(90646),
  
  NUMBER_90656(90656),
  
  NUMBER_90617(90617),
  
  NUMBER_90605(90605),
  
  NUMBER_90608(90608),
  
  NUMBER_40113(40113),
  
  NUMBER_40141(40141);
  private Integer value;
  CatalogBank(Integer value) {
    this.value = value;
  }
  public Integer getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogBank fromValue(String text) {
    for (CatalogBank b : CatalogBank.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogBank> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogBank enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogBank read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CatalogBank.fromValue(String.valueOf(value));
    }
  }
}
