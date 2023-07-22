import React from "react";
import classNames from "classnames/bind";
import Carousel from "react-multi-carousel";
import styles from "./portfolio-carousel.module.scss";
import "react-multi-carousel/lib/styles.css";
const ss = classNames.bind(styles);

const PortfolioCarousel = () => {
  const responsive = {
    superLargeDesktop: {
      // the naming can be any, depends on you.
      breakpoint: { max: 4000, min: 3000 },
      items: 3,
    },
    desktop: {
      breakpoint: { max: 3000, min: 1024 },
      items: 2,
    },
    tablet: {
      breakpoint: { max: 1024, min: 464 },
      items: 2,
    },
    mobile: {
      breakpoint: { max: 464, min: 0 },
      items: 2,
    },
  };
  return (
    <div className={ss("wrapper")}>
      <Carousel responsive={responsive}>
        <div>Item 1</div>
        <div>Item 2</div>
        <div>Item 3</div>
        <div>Item 4</div>
      </Carousel>
    </div>
  );
};

export default PortfolioCarousel;
