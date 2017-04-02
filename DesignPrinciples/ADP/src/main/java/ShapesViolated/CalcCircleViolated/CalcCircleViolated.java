package ShapesViolated.CalcCircleViolated;

import Shapes.CircleInfo.CircleInfo;
import ShapesViolated.CircleInfoViolated.CircleInfoViolated;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CalcCircleViolated  extends CircleInfoViolated{
        CircleInfoViolated circleInfoV;

        public int area()
        {
            return (22/7)*(circleInfoV.getRadius()*circleInfoV.getRadius());
        }
        public int circumference()
        {
            return 2*(22/7)*circleInfoV.getRadius();
        }
    }
