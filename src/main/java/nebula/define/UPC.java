package nebula.define;

import nebula.define.annotation.Desc;
import nebula.define.annotation.MaxLength;

@MaxLength(20)
@Desc("条形码")
public interface UPC extends String {
};