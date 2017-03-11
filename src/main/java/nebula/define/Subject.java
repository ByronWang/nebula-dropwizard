package nebula.define;

import nebula.define.annotation.Desc;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength(256)
@Desc("主题")
@SingleLine
public interface Subject/*|zh:主题*/ extends String {
};