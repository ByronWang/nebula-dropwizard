package nebula.define;

import nebula.define.Desc;
import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.String;

@MaxLength(256)
@Desc("消息")
@SingleLine
public interface Message/*|zh:消息*/ extends String {
};