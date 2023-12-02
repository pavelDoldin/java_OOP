package sem_6.task_3;

import java.util.List;

public class CalcAreaServiceV2 {

    private List<ShapeV2> shapes;

    public List<ShapeV2> getShapes() {
        return shapes;
    }

    public CalcAreaServiceV2(List<ShapeV2> shapes) {
        this.shapes = shapes;
    }

    public void processAll(){
        double sumArea = 0;
        for (ShapeV2 shape : shapes) {
            sumArea += shape.getArea();
        }
        System.out.printf("Сумма площадей фигур ровна %f \n", sumArea);
    }


}
