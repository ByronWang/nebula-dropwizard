package nebula.define;

import nebula.define.Desc;
import nebula.define.MaxLength;
import nebula.define.String;

@MaxLength(20)
@Desc("条形码")
public interface UPC extends String {
};