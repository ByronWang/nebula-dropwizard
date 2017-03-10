package nebula.define;

import nebula.define.Format;
import nebula.define.FormatType;

@FormatType("birthday")
@Format("mm-dd")
public interface Birthday/*|zh:生日 */ extends Date {
};