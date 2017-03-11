package nebula.define;

import nebula.define.annotation.Format;
import nebula.define.annotation.FormatType;

@FormatType("birthday")
@Format("mm-dd")
public interface Birthday/*|zh:生日 */ extends Date {
};