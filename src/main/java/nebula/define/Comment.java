package nebula.define;

import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.Text;

@MaxLength(1200)
@SingleLine
public interface Comment/*|备注 */ extends Text {
};