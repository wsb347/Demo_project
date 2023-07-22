import React from "react";
import {
  ScheduleComponent,
  Day,
  Week,
  WorkWeek,
  Month,
  Agenda,
  Inject,
} from "@syncfusion/ej2-react-schedule";

import classNames from "classnames/bind";
import styles from "./scheduler.module.scss";
const ss = classNames.bind(styles);
const Scheduler = () => {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "center",
        fontSize: "24px",
        color: "white",
        width: "500px",
        height: "500px",
        alignItems: "center",
      }}
    >
      schduler할것
    </div>
  );
};

export default Scheduler;
