package nebula.define;

import nebula.define.annotation.Desc;
import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength(255)
@Desc("单行的描述")
@SingleLine
public interface Description/*|描述*/ extends String {
};