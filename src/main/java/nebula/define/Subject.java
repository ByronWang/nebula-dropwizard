package nebula.define;

import nebula.define.Desc;
import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.String;

@MaxLength(256)
@Desc("主题")
@SingleLine
public interface Subject/*|zh:主题*/ extends String {
};