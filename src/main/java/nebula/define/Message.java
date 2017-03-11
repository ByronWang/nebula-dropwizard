package nebula.define;

import nebula.define.annotation.Desc;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength(256)
@Desc("消息")
@SingleLine
public interface Message/*|zh:消息*/ extends String {
};