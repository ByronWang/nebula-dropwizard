package nebula.define;

import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.Text;

@MaxLength(1200)
@SingleLine
public interface Summary/*|zh:简述 */ extends Text {
};