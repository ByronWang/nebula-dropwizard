package nebula.define;

import nebula.define.Desc;
import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.String;

@MaxLength(255)
@Desc("单行的描述")
@SingleLine
public interface Description/*|描述*/ extends String {
};